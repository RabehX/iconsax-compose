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

val Iconsax.Outline.Note1: ImageVector
    get() {
        if (_Note1 != null) {
            return _Note1!!
        }
        _Note1 = ImageVector.Builder(
            name = "Outline.Note1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 5.75f)
                curveTo(7.59f, 5.75f, 7.25f, 5.41f, 7.25f, 5f)
                verticalLineTo(2f)
                curveTo(7.25f, 1.59f, 7.59f, 1.25f, 8f, 1.25f)
                curveTo(8.41f, 1.25f, 8.75f, 1.59f, 8.75f, 2f)
                verticalLineTo(5f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 5.75f)
                curveTo(15.59f, 5.75f, 15.25f, 5.41f, 15.25f, 5f)
                verticalLineTo(2f)
                curveTo(15.25f, 1.59f, 15.59f, 1.25f, 16f, 1.25f)
                curveTo(16.41f, 1.25f, 16.75f, 1.59f, 16.75f, 2f)
                verticalLineTo(5f)
                curveTo(16.75f, 5.41f, 16.41f, 5.75f, 16f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 13.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 13.75f, 6.25f, 13.41f, 6.25f, 13f)
                curveTo(6.25f, 12.59f, 6.59f, 12.25f, 7f, 12.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 12.25f, 15.75f, 12.59f, 15.75f, 13f)
                curveTo(15.75f, 13.41f, 15.41f, 13.75f, 15f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 17.75f, 6.25f, 17.41f, 6.25f, 17f)
                curveTo(6.25f, 16.59f, 6.59f, 16.25f, 7f, 16.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 16.25f, 12.75f, 16.59f, 12.75f, 17f)
                curveTo(12.75f, 17.41f, 12.41f, 17.75f, 12f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.38f, 22.75f, 2.25f, 20.1f, 2.25f, 15.82f)
                verticalLineTo(9.65f)
                curveTo(2.25f, 4.91f, 3.85f, 2.98f, 7.96f, 2.75f)
                horizontalLineTo(16f)
                curveTo(16.01f, 2.75f, 16.03f, 2.75f, 16.04f, 2.75f)
                curveTo(20.15f, 2.98f, 21.75f, 4.91f, 21.75f, 9.65f)
                verticalLineTo(15.82f)
                curveTo(21.75f, 20.1f, 20.62f, 22.75f, 15f, 22.75f)
                close()
                moveTo(8f, 4.25f)
                curveTo(5.2f, 4.41f, 3.75f, 5.29f, 3.75f, 9.65f)
                verticalLineTo(15.82f)
                curveTo(3.75f, 19.65f, 4.48f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.52f, 21.25f, 20.25f, 19.65f, 20.25f, 15.82f)
                verticalLineTo(9.65f)
                curveTo(20.25f, 5.3f, 18.81f, 4.41f, 15.98f, 4.25f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _Note1!!
    }

@Suppress("ObjectPropertyName")
private var _Note1: ImageVector? = null
