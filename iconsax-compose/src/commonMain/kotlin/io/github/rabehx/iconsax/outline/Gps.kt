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

val Iconsax.Outline.Gps: ImageVector
    get() {
        if (_Gps != null) {
            return _Gps!!
        }
        _Gps = ImageVector.Builder(
            name = "Outline.Gps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 20.25f)
                curveTo(7.45f, 20.25f, 3.75f, 16.55f, 3.75f, 12f)
                curveTo(3.75f, 7.45f, 7.45f, 3.75f, 12f, 3.75f)
                curveTo(16.55f, 3.75f, 20.25f, 7.45f, 20.25f, 12f)
                curveTo(20.25f, 16.55f, 16.55f, 20.25f, 12f, 20.25f)
                close()
                moveTo(12f, 5.25f)
                curveTo(8.28f, 5.25f, 5.25f, 8.28f, 5.25f, 12f)
                curveTo(5.25f, 15.72f, 8.28f, 18.75f, 12f, 18.75f)
                curveTo(15.72f, 18.75f, 18.75f, 15.72f, 18.75f, 12f)
                curveTo(18.75f, 8.28f, 15.72f, 5.25f, 12f, 5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.75f)
                curveTo(9.93f, 15.75f, 8.25f, 14.07f, 8.25f, 12f)
                curveTo(8.25f, 9.93f, 9.93f, 8.25f, 12f, 8.25f)
                curveTo(14.07f, 8.25f, 15.75f, 9.93f, 15.75f, 12f)
                curveTo(15.75f, 14.07f, 14.07f, 15.75f, 12f, 15.75f)
                close()
                moveTo(12f, 9.75f)
                curveTo(10.76f, 9.75f, 9.75f, 10.76f, 9.75f, 12f)
                curveTo(9.75f, 13.24f, 10.76f, 14.25f, 12f, 14.25f)
                curveTo(13.24f, 14.25f, 14.25f, 13.24f, 14.25f, 12f)
                curveTo(14.25f, 10.76f, 13.24f, 9.75f, 12f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 4.75f)
                curveTo(11.59f, 4.75f, 11.25f, 4.41f, 11.25f, 4f)
                verticalLineTo(2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(12.41f, 1.25f, 12.75f, 1.59f, 12.75f, 2f)
                verticalLineTo(4f)
                curveTo(12.75f, 4.41f, 12.41f, 4.75f, 12f, 4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                horizontalLineTo(4f)
                curveTo(4.41f, 11.25f, 4.75f, 11.59f, 4.75f, 12f)
                curveTo(4.75f, 12.41f, 4.41f, 12.75f, 4f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(20f)
                curveTo(11.25f, 19.59f, 11.59f, 19.25f, 12f, 19.25f)
                curveTo(12.41f, 19.25f, 12.75f, 19.59f, 12.75f, 20f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 12.75f)
                horizontalLineTo(20f)
                curveTo(19.59f, 12.75f, 19.25f, 12.41f, 19.25f, 12f)
                curveTo(19.25f, 11.59f, 19.59f, 11.25f, 20f, 11.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22f, 12.75f)
                close()
            }
        }.build()

        return _Gps!!
    }

@Suppress("ObjectPropertyName")
private var _Gps: ImageVector? = null
