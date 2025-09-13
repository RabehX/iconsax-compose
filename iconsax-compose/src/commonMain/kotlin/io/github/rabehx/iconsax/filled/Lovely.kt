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


val Iconsax.Filled.Lovely: ImageVector
    get() {
        if (_Lovely != null) {
            return _Lovely!!
        }
        _Lovely = ImageVector.Builder(
            name = "Filled.Lovely",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.801f, 9.91f)
                curveTo(17.671f, 9.91f, 16.661f, 10.46f, 16.031f, 11.3f)
                curveTo(15.401f, 10.46f, 14.391f, 9.91f, 13.261f, 9.91f)
                curveTo(11.351f, 9.91f, 9.801f, 11.47f, 9.801f, 13.39f)
                curveTo(9.801f, 14.13f, 9.921f, 14.82f, 10.121f, 15.45f)
                curveTo(11.101f, 18.56f, 14.141f, 20.43f, 15.641f, 20.94f)
                curveTo(15.851f, 21.01f, 16.201f, 21.01f, 16.411f, 20.94f)
                curveTo(17.911f, 20.43f, 20.951f, 18.57f, 21.931f, 15.45f)
                curveTo(22.141f, 14.81f, 22.251f, 14.13f, 22.251f, 13.39f)
                curveTo(22.261f, 11.47f, 20.711f, 9.91f, 18.801f, 9.91f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.75f, 8.342f)
                curveTo(20.75f, 8.572f, 20.52f, 8.722f, 20.3f, 8.662f)
                curveTo(18.95f, 8.312f, 17.47f, 8.602f, 16.35f, 9.402f)
                curveTo(16.13f, 9.562f, 15.83f, 9.562f, 15.62f, 9.402f)
                curveTo(14.83f, 8.822f, 13.87f, 8.502f, 12.86f, 8.502f)
                curveTo(10.28f, 8.502f, 8.18f, 10.612f, 8.18f, 13.212f)
                curveTo(8.18f, 16.032f, 9.53f, 18.142f, 10.89f, 19.552f)
                curveTo(10.96f, 19.622f, 10.9f, 19.742f, 10.81f, 19.702f)
                curveTo(8.08f, 18.772f, 2f, 14.912f, 2f, 8.342f)
                curveTo(2f, 5.442f, 4.33f, 3.102f, 7.21f, 3.102f)
                curveTo(8.92f, 3.102f, 10.43f, 3.922f, 11.38f, 5.192f)
                curveTo(12.34f, 3.922f, 13.85f, 3.102f, 15.55f, 3.102f)
                curveTo(18.42f, 3.102f, 20.75f, 5.442f, 20.75f, 8.342f)
                close()
            }
        }.build()

        return _Lovely!!
    }

@Suppress("ObjectPropertyName")
private var _Lovely: ImageVector? = null
