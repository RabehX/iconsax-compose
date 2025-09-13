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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Filled.Bag: ImageVector
    get() {
        if (_Bag != null) {
            return _Bag!!
        }
        _Bag = ImageVector.Builder(
            name = "Filled.Bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.24f, 5.579f)
                horizontalLineTo(18.84f)
                lineTo(15.46f, 2.199f)
                curveTo(15.19f, 1.929f, 14.75f, 1.929f, 14.47f, 2.199f)
                curveTo(14.2f, 2.469f, 14.2f, 2.909f, 14.47f, 3.189f)
                lineTo(16.86f, 5.579f)
                horizontalLineTo(7.14f)
                lineTo(9.53f, 3.189f)
                curveTo(9.8f, 2.919f, 9.8f, 2.479f, 9.53f, 2.199f)
                curveTo(9.26f, 1.929f, 8.82f, 1.929f, 8.54f, 2.199f)
                lineTo(5.17f, 5.579f)
                horizontalLineTo(4.77f)
                curveTo(3.87f, 5.579f, 2f, 5.579f, 2f, 8.139f)
                curveTo(2f, 9.109f, 2.2f, 9.749f, 2.62f, 10.169f)
                curveTo(2.86f, 10.419f, 3.15f, 10.549f, 3.46f, 10.619f)
                curveTo(3.75f, 10.689f, 4.06f, 10.699f, 4.36f, 10.699f)
                horizontalLineTo(19.64f)
                curveTo(19.95f, 10.699f, 20.24f, 10.679f, 20.52f, 10.619f)
                curveTo(21.36f, 10.419f, 22f, 9.819f, 22f, 8.139f)
                curveTo(22f, 5.579f, 20.13f, 5.579f, 19.24f, 5.579f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.051f, 12f)
                horizontalLineTo(4.871f)
                curveTo(4.251f, 12f, 3.781f, 12.55f, 3.881f, 13.16f)
                lineTo(4.721f, 18.3f)
                curveTo(5.001f, 20.02f, 5.751f, 22f, 9.081f, 22f)
                horizontalLineTo(14.691f)
                curveTo(18.061f, 22f, 18.661f, 20.31f, 19.021f, 18.42f)
                lineTo(20.031f, 13.19f)
                curveTo(20.151f, 12.57f, 19.681f, 12f, 19.051f, 12f)
                close()
                moveTo(10.611f, 18.45f)
                curveTo(10.611f, 18.84f, 10.301f, 19.15f, 9.921f, 19.15f)
                curveTo(9.531f, 19.15f, 9.221f, 18.84f, 9.221f, 18.45f)
                verticalLineTo(15.15f)
                curveTo(9.221f, 14.77f, 9.531f, 14.45f, 9.921f, 14.45f)
                curveTo(10.301f, 14.45f, 10.611f, 14.77f, 10.611f, 15.15f)
                verticalLineTo(18.45f)
                close()
                moveTo(14.891f, 18.45f)
                curveTo(14.891f, 18.84f, 14.581f, 19.15f, 14.191f, 19.15f)
                curveTo(13.811f, 19.15f, 13.491f, 18.84f, 13.491f, 18.45f)
                verticalLineTo(15.15f)
                curveTo(13.491f, 14.77f, 13.811f, 14.45f, 14.191f, 14.45f)
                curveTo(14.581f, 14.45f, 14.891f, 14.77f, 14.891f, 15.15f)
                verticalLineTo(18.45f)
                close()
            }
        }.build()

        return _Bag!!
    }

@Suppress("ObjectPropertyName")
private var _Bag: ImageVector? = null
