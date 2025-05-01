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


val Iconsax.Filled.Status: ImageVector
    get() {
        if (_Status != null) {
            return _Status!!
        }
        _Status = ImageVector.Builder(
            name = "Filled.Status",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.001f, 14.219f)
                horizontalLineTo(3.921f)
                curveTo(3.311f, 14.219f, 2.751f, 14.529f, 2.431f, 15.049f)
                curveTo(2.111f, 15.559f, 2.081f, 16.169f, 2.341f, 16.709f)
                curveTo(3.571f, 19.229f, 5.791f, 21.209f, 8.431f, 22.139f)
                curveTo(8.611f, 22.199f, 8.811f, 22.239f, 9.001f, 22.239f)
                curveTo(9.351f, 22.239f, 9.701f, 22.129f, 10.001f, 21.919f)
                curveTo(10.471f, 21.589f, 10.751f, 21.049f, 10.751f, 20.479f)
                lineTo(10.761f, 15.979f)
                curveTo(10.761f, 15.509f, 10.581f, 15.069f, 10.251f, 14.739f)
                curveTo(9.911f, 14.409f, 9.471f, 14.219f, 9.001f, 14.219f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.48f, 9.6f)
                curveTo(21.36f, 4.68f, 17.05f, 1.25f, 12f, 1.25f)
                curveTo(6.95f, 1.25f, 2.64f, 4.68f, 1.52f, 9.6f)
                curveTo(1.4f, 10.12f, 1.52f, 10.65f, 1.86f, 11.07f)
                curveTo(2.2f, 11.49f, 2.7f, 11.73f, 3.24f, 11.73f)
                horizontalLineTo(20.77f)
                curveTo(21.31f, 11.73f, 21.81f, 11.49f, 22.15f, 11.07f)
                curveTo(22.48f, 10.65f, 22.6f, 10.11f, 22.48f, 9.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.06f, 14.272f)
                lineTo(15f, 14.262f)
                curveTo(14.53f, 14.262f, 14.09f, 14.442f, 13.76f, 14.772f)
                curveTo(13.43f, 15.102f, 13.25f, 15.542f, 13.25f, 16.012f)
                lineTo(13.26f, 20.492f)
                curveTo(13.26f, 21.062f, 13.54f, 21.602f, 14.01f, 21.932f)
                curveTo(14.31f, 22.142f, 14.66f, 22.252f, 15.01f, 22.252f)
                curveTo(15.2f, 22.252f, 15.39f, 22.222f, 15.57f, 22.152f)
                curveTo(18.19f, 21.232f, 20.41f, 19.262f, 21.64f, 16.772f)
                curveTo(21.9f, 16.242f, 21.87f, 15.622f, 21.56f, 15.122f)
                curveTo(21.23f, 14.582f, 20.67f, 14.272f, 20.06f, 14.272f)
                close()
            }
        }.build()

        return _Status!!
    }

@Suppress("ObjectPropertyName")
private var _Status: ImageVector? = null
