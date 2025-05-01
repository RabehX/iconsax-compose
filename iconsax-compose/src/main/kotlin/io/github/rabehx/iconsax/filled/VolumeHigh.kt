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


val Iconsax.Filled.VolumeHigh: ImageVector
    get() {
        if (_VolumeHigh != null) {
            return _VolumeHigh!!
        }
        _VolumeHigh = ImageVector.Builder(
            name = "Filled.VolumeHigh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 16.75f)
                curveTo(17.84f, 16.75f, 17.69f, 16.7f, 17.55f, 16.6f)
                curveTo(17.22f, 16.35f, 17.15f, 15.88f, 17.4f, 15.55f)
                curveTo(18.97f, 13.46f, 18.97f, 10.54f, 17.4f, 8.45f)
                curveTo(17.15f, 8.12f, 17.22f, 7.65f, 17.55f, 7.4f)
                curveTo(17.88f, 7.15f, 18.35f, 7.22f, 18.6f, 7.55f)
                curveTo(20.56f, 10.17f, 20.56f, 13.83f, 18.6f, 16.45f)
                curveTo(18.45f, 16.65f, 18.23f, 16.75f, 18f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.828f, 19.25f)
                curveTo(19.668f, 19.25f, 19.518f, 19.2f, 19.378f, 19.1f)
                curveTo(19.048f, 18.85f, 18.978f, 18.38f, 19.228f, 18.05f)
                curveTo(21.898f, 14.49f, 21.898f, 9.51f, 19.228f, 5.95f)
                curveTo(18.978f, 5.62f, 19.048f, 5.15f, 19.378f, 4.9f)
                curveTo(19.708f, 4.65f, 20.178f, 4.72f, 20.428f, 5.05f)
                curveTo(23.498f, 9.14f, 23.498f, 14.86f, 20.428f, 18.95f)
                curveTo(20.288f, 19.15f, 20.058f, 19.25f, 19.828f, 19.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.02f, 3.782f)
                curveTo(12.9f, 3.162f, 11.47f, 3.322f, 10.01f, 4.232f)
                lineTo(7.09f, 6.062f)
                curveTo(6.89f, 6.182f, 6.66f, 6.252f, 6.43f, 6.252f)
                horizontalLineTo(5.5f)
                horizontalLineTo(5f)
                curveTo(2.58f, 6.252f, 1.25f, 7.582f, 1.25f, 10.002f)
                verticalLineTo(14.002f)
                curveTo(1.25f, 16.422f, 2.58f, 17.752f, 5f, 17.752f)
                horizontalLineTo(5.5f)
                horizontalLineTo(6.43f)
                curveTo(6.66f, 17.752f, 6.89f, 17.822f, 7.09f, 17.942f)
                lineTo(10.01f, 19.772f)
                curveTo(10.89f, 20.322f, 11.75f, 20.592f, 12.55f, 20.592f)
                curveTo(13.07f, 20.592f, 13.57f, 20.472f, 14.02f, 20.222f)
                curveTo(15.13f, 19.602f, 15.75f, 18.312f, 15.75f, 16.592f)
                verticalLineTo(7.412f)
                curveTo(15.75f, 5.692f, 15.13f, 4.402f, 14.02f, 3.782f)
                close()
            }
        }.build()

        return _VolumeHigh!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeHigh: ImageVector? = null
