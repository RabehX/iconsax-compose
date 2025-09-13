/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.RotateRight1: ImageVector
    get() {
        if (_RotateRight1 != null) {
            return _RotateRight1!!
        }
        _RotateRight1 = ImageVector.Builder(
            name = "Outline.RotateRight1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.75f, 22.75f)
                horizontalLineTo(12.25f)
                curveTo(8.1f, 22.75f, 6.25f, 20.9f, 6.25f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(6.25f, 8.1f, 8.1f, 6.25f, 12.25f, 6.25f)
                horizontalLineTo(16.75f)
                curveTo(20.9f, 6.25f, 22.75f, 8.1f, 22.75f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(22.75f, 20.9f, 20.9f, 22.75f, 16.75f, 22.75f)
                close()
                moveTo(12.25f, 7.75f)
                curveTo(8.93f, 7.75f, 7.75f, 8.93f, 7.75f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(7.75f, 20.07f, 8.93f, 21.25f, 12.25f, 21.25f)
                horizontalLineTo(16.75f)
                curveTo(20.07f, 21.25f, 21.25f, 20.07f, 21.25f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(21.25f, 8.93f, 20.07f, 7.75f, 16.75f, 7.75f)
                horizontalLineTo(12.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 9.75f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9f)
                curveTo(1.25f, 4.73f, 4.73f, 1.25f, 9f, 1.25f)
                curveTo(9.27f, 1.25f, 9.52f, 1.4f, 9.65f, 1.63f)
                curveTo(9.78f, 1.86f, 9.78f, 2.15f, 9.64f, 2.38f)
                lineTo(8.59f, 4.14f)
                curveTo(8.38f, 4.49f, 7.92f, 4.61f, 7.56f, 4.39f)
                curveTo(7.21f, 4.18f, 7.09f, 3.72f, 7.31f, 3.36f)
                lineTo(7.58f, 2.91f)
                curveTo(4.81f, 3.56f, 2.75f, 6.04f, 2.75f, 9f)
                curveTo(2.75f, 9.41f, 2.41f, 9.75f, 2f, 9.75f)
                close()
            }
        }.build()

        return _RotateRight1!!
    }

@Suppress("ObjectPropertyName")
private var _RotateRight1: ImageVector? = null
