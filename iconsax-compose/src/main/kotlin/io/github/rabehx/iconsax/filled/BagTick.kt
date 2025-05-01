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

val Iconsax.Filled.BagTick: ImageVector
    get() {
        if (_BagTick != null) {
            return _BagTick!!
        }
        _BagTick = ImageVector.Builder(
            name = "Filled.BagTick",
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
                moveTo(19.09f, 12f)
                horizontalLineTo(4.91f)
                curveTo(4.29f, 12f, 3.82f, 12.55f, 3.92f, 13.16f)
                lineTo(4.76f, 18.3f)
                curveTo(5.04f, 20.02f, 5.79f, 22f, 9.12f, 22f)
                horizontalLineTo(14.73f)
                curveTo(18.1f, 22f, 18.7f, 20.31f, 19.06f, 18.42f)
                lineTo(20.07f, 13.19f)
                curveTo(20.19f, 12.57f, 19.72f, 12f, 19.09f, 12f)
                close()
                moveTo(14.88f, 16.05f)
                lineTo(11.63f, 19.05f)
                curveTo(11.49f, 19.18f, 11.31f, 19.25f, 11.12f, 19.25f)
                curveTo(10.93f, 19.25f, 10.74f, 19.18f, 10.59f, 19.03f)
                lineTo(9.09f, 17.53f)
                curveTo(8.8f, 17.24f, 8.8f, 16.76f, 9.09f, 16.47f)
                curveTo(9.39f, 16.18f, 9.86f, 16.18f, 10.16f, 16.47f)
                lineTo(11.15f, 17.46f)
                lineTo(13.87f, 14.95f)
                curveTo(14.17f, 14.67f, 14.65f, 14.69f, 14.93f, 14.99f)
                curveTo(15.21f, 15.3f, 15.19f, 15.77f, 14.88f, 16.05f)
                close()
            }
        }.build()

        return _BagTick!!
    }

@Suppress("ObjectPropertyName")
private var _BagTick: ImageVector? = null
