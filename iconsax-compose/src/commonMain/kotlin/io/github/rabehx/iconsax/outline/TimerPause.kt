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

val Iconsax.Outline.TimerPause: ImageVector
    get() {
        if (_TimerPause != null) {
            return _TimerPause!!
        }
        _TimerPause = ImageVector.Builder(
            name = "Outline.TimerPause",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.76f, 22.75f, 2.5f, 18.49f, 2.5f, 13.25f)
                curveTo(2.5f, 8.01f, 6.76f, 3.75f, 12f, 3.75f)
                curveTo(17.24f, 3.75f, 21.5f, 8.01f, 21.5f, 13.25f)
                curveTo(21.5f, 13.66f, 21.16f, 14f, 20.75f, 14f)
                curveTo(20.34f, 14f, 20f, 13.66f, 20f, 13.25f)
                curveTo(20f, 8.84f, 16.41f, 5.25f, 12f, 5.25f)
                curveTo(7.59f, 5.25f, 4f, 8.84f, 4f, 13.25f)
                curveTo(4f, 17.66f, 7.59f, 21.25f, 12f, 21.25f)
                curveTo(12.41f, 21.25f, 12.75f, 21.59f, 12.75f, 22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.75f)
                curveTo(11.59f, 13.75f, 11.25f, 13.41f, 11.25f, 13f)
                verticalLineTo(8f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12f, 7.25f)
                curveTo(12.41f, 7.25f, 12.75f, 7.59f, 12.75f, 8f)
                verticalLineTo(13f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 2.75f, 8.25f, 2.41f, 8.25f, 2f)
                curveTo(8.25f, 1.59f, 8.59f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 1.25f, 15.75f, 1.59f, 15.75f, 2f)
                curveTo(15.75f, 2.41f, 15.41f, 2.75f, 15f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 21.75f)
                curveTo(18.59f, 21.75f, 18.25f, 21.41f, 18.25f, 21f)
                verticalLineTo(17f)
                curveTo(18.25f, 16.59f, 18.59f, 16.25f, 19f, 16.25f)
                curveTo(19.41f, 16.25f, 19.75f, 16.59f, 19.75f, 17f)
                verticalLineTo(21f)
                curveTo(19.75f, 21.41f, 19.41f, 21.75f, 19f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 21.75f)
                curveTo(15.59f, 21.75f, 15.25f, 21.41f, 15.25f, 21f)
                verticalLineTo(17f)
                curveTo(15.25f, 16.59f, 15.59f, 16.25f, 16f, 16.25f)
                curveTo(16.41f, 16.25f, 16.75f, 16.59f, 16.75f, 17f)
                verticalLineTo(21f)
                curveTo(16.75f, 21.41f, 16.41f, 21.75f, 16f, 21.75f)
                close()
            }
        }.build()

        return _TimerPause!!
    }

@Suppress("ObjectPropertyName")
private var _TimerPause: ImageVector? = null
