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


val Iconsax.Filled.Coffee: ImageVector
    get() {
        if (_Coffee != null) {
            return _Coffee!!
        }
        _Coffee = ImageVector.Builder(
            name = "Filled.Coffee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 5.121f)
                curveTo(5.59f, 5.121f, 5.25f, 4.781f, 5.25f, 4.371f)
                verticalLineTo(2.621f)
                curveTo(5.25f, 2.211f, 5.59f, 1.871f, 6f, 1.871f)
                curveTo(6.41f, 1.871f, 6.75f, 2.211f, 6.75f, 2.621f)
                verticalLineTo(4.371f)
                curveTo(6.75f, 4.791f, 6.41f, 5.121f, 6f, 5.121f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 5.121f)
                curveTo(9.59f, 5.121f, 9.25f, 4.781f, 9.25f, 4.371f)
                verticalLineTo(2.621f)
                curveTo(9.25f, 2.211f, 9.59f, 1.871f, 10f, 1.871f)
                curveTo(10.41f, 1.871f, 10.75f, 2.211f, 10.75f, 2.621f)
                verticalLineTo(4.371f)
                curveTo(10.75f, 4.791f, 10.41f, 5.121f, 10f, 5.121f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 5.121f)
                curveTo(13.59f, 5.121f, 13.25f, 4.781f, 13.25f, 4.371f)
                verticalLineTo(2.621f)
                curveTo(13.25f, 2.211f, 13.59f, 1.871f, 14f, 1.871f)
                curveTo(14.41f, 1.871f, 14.75f, 2.211f, 14.75f, 2.621f)
                verticalLineTo(4.371f)
                curveTo(14.75f, 4.791f, 14.41f, 5.121f, 14f, 5.121f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.25f, 13.252f)
                curveTo(22.25f, 10.632f, 20.22f, 8.512f, 17.66f, 8.292f)
                curveTo(16.92f, 7.082f, 15.6f, 6.262f, 14.08f, 6.262f)
                horizontalLineTo(6.71f)
                curveTo(4.39f, 6.262f, 2.5f, 8.152f, 2.5f, 10.472f)
                verticalLineTo(11.002f)
                horizontalLineTo(18.29f)
                verticalLineTo(10.472f)
                curveTo(18.29f, 10.282f, 18.26f, 10.092f, 18.23f, 9.912f)
                curveTo(19.68f, 10.342f, 20.75f, 11.662f, 20.75f, 13.252f)
                curveTo(20.75f, 14.822f, 19.71f, 16.132f, 18.29f, 16.572f)
                verticalLineTo(12.002f)
                horizontalLineTo(2.5f)
                verticalLineTo(17.792f)
                curveTo(2.5f, 20.112f, 4.39f, 22.002f, 6.71f, 22.002f)
                horizontalLineTo(14.08f)
                curveTo(16.28f, 22.002f, 18.07f, 20.302f, 18.25f, 18.142f)
                curveTo(20.53f, 17.682f, 22.25f, 15.662f, 22.25f, 13.252f)
                close()
            }
        }.build()

        return _Coffee!!
    }

@Suppress("ObjectPropertyName")
private var _Coffee: ImageVector? = null
