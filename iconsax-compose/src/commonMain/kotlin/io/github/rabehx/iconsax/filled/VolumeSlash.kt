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


val Iconsax.Filled.VolumeSlash: ImageVector
    get() {
        if (_VolumeSlash != null) {
            return _VolumeSlash!!
        }
        _VolumeSlash = ImageVector.Builder(
            name = "Filled.VolumeSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 16.75f)
                curveTo(17.84f, 16.75f, 17.69f, 16.7f, 17.55f, 16.6f)
                curveTo(17.22f, 16.35f, 17.15f, 15.88f, 17.4f, 15.55f)
                curveTo(18.66f, 13.87f, 18.93f, 11.64f, 18.12f, 9.71f)
                curveTo(17.96f, 9.33f, 18.14f, 8.89f, 18.52f, 8.73f)
                curveTo(18.9f, 8.57f, 19.34f, 8.75f, 19.5f, 9.13f)
                curveTo(20.52f, 11.55f, 20.17f, 14.36f, 18.6f, 16.46f)
                curveTo(18.45f, 16.65f, 18.23f, 16.75f, 18f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.828f, 19.249f)
                curveTo(19.668f, 19.249f, 19.518f, 19.199f, 19.378f, 19.099f)
                curveTo(19.048f, 18.849f, 18.978f, 18.379f, 19.228f, 18.049f)
                curveTo(21.368f, 15.199f, 21.838f, 11.379f, 20.458f, 8.089f)
                curveTo(20.298f, 7.709f, 20.478f, 7.269f, 20.858f, 7.109f)
                curveTo(21.238f, 6.949f, 21.678f, 7.129f, 21.838f, 7.509f)
                curveTo(23.428f, 11.289f, 22.888f, 15.669f, 20.428f, 18.949f)
                curveTo(20.288f, 19.149f, 20.058f, 19.249f, 19.828f, 19.249f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.04f, 12.958f)
                curveTo(14.67f, 12.328f, 15.75f, 12.778f, 15.75f, 13.668f)
                verticalLineTo(16.598f)
                curveTo(15.75f, 18.318f, 15.13f, 19.608f, 14.021f, 20.228f)
                curveTo(13.571f, 20.478f, 13.071f, 20.598f, 12.55f, 20.598f)
                curveTo(11.75f, 20.598f, 10.891f, 20.328f, 10.01f, 19.778f)
                lineTo(9.37f, 19.378f)
                curveTo(8.83f, 19.038f, 8.74f, 18.278f, 9.19f, 17.828f)
                lineTo(14.04f, 12.958f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.77f, 2.229f)
                curveTo(21.47f, 1.929f, 20.98f, 1.929f, 20.68f, 2.229f)
                lineTo(15.73f, 7.179f)
                curveTo(15.67f, 5.579f, 15.07f, 4.379f, 14.01f, 3.789f)
                curveTo(12.89f, 3.169f, 11.46f, 3.329f, 10f, 4.239f)
                lineTo(7.09f, 6.059f)
                curveTo(6.89f, 6.179f, 6.66f, 6.249f, 6.43f, 6.249f)
                horizontalLineTo(5.5f)
                horizontalLineTo(5f)
                curveTo(2.58f, 6.249f, 1.25f, 7.579f, 1.25f, 9.999f)
                verticalLineTo(13.999f)
                curveTo(1.25f, 16.419f, 2.58f, 17.749f, 5f, 17.749f)
                horizontalLineTo(5.16f)
                lineTo(2.22f, 20.689f)
                curveTo(1.92f, 20.989f, 1.92f, 21.479f, 2.22f, 21.779f)
                curveTo(2.38f, 21.919f, 2.57f, 21.999f, 2.77f, 21.999f)
                curveTo(2.97f, 21.999f, 3.16f, 21.919f, 3.31f, 21.769f)
                lineTo(21.77f, 3.309f)
                curveTo(22.08f, 3.009f, 22.08f, 2.529f, 21.77f, 2.229f)
                close()
            }
        }.build()

        return _VolumeSlash!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeSlash: ImageVector? = null
