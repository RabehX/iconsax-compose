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

val Iconsax.Outline.Grid8: ImageVector
    get() {
        if (_Grid8 != null) {
            return _Grid8!!
        }
        _Grid8 = ImageVector.Builder(
            name = "Outline.Grid8",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.25f, 22.25f)
                curveTo(7.84f, 22.25f, 7.5f, 21.91f, 7.5f, 21.5f)
                verticalLineTo(12f)
                curveTo(7.5f, 11.59f, 7.84f, 11.25f, 8.25f, 11.25f)
                curveTo(8.66f, 11.25f, 9f, 11.59f, 9f, 12f)
                verticalLineTo(21.5f)
                curveTo(9f, 21.91f, 8.66f, 22.25f, 8.25f, 22.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.75f, 22.75f)
                curveTo(15.34f, 22.75f, 15f, 22.41f, 15f, 22f)
                verticalLineTo(12f)
                curveTo(15f, 11.59f, 15.34f, 11.25f, 15.75f, 11.25f)
                curveTo(16.16f, 11.25f, 16.5f, 11.59f, 16.5f, 12f)
                verticalLineTo(22f)
                curveTo(16.5f, 22.41f, 16.16f, 22.75f, 15.75f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.25f, 12.75f)
                curveTo(7.84f, 12.75f, 7.5f, 12.41f, 7.5f, 12f)
                verticalLineTo(2f)
                curveTo(7.5f, 1.59f, 7.84f, 1.25f, 8.25f, 1.25f)
                curveTo(8.66f, 1.25f, 9f, 1.59f, 9f, 2f)
                verticalLineTo(12f)
                curveTo(9f, 12.41f, 8.66f, 12.75f, 8.25f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.75f, 12.75f)
                curveTo(15.34f, 12.75f, 15f, 12.41f, 15f, 12f)
                verticalLineTo(2.54f)
                curveTo(15f, 2.13f, 15.34f, 1.79f, 15.75f, 1.79f)
                curveTo(16.16f, 1.79f, 16.5f, 2.13f, 16.5f, 2.54f)
                verticalLineTo(12f)
                curveTo(16.5f, 12.41f, 16.16f, 12.75f, 15.75f, 12.75f)
                close()
            }
        }.build()

        return _Grid8!!
    }

@Suppress("ObjectPropertyName")
private var _Grid8: ImageVector? = null
