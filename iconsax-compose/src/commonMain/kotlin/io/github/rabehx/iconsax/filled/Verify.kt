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


val Iconsax.Filled.Verify: ImageVector
    get() {
        if (_Verify != null) {
            return _Verify!!
        }
        _Verify = ImageVector.Builder(
            name = "Filled.Verify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.561f, 10.739f)
                lineTo(20.201f, 9.159f)
                curveTo(19.941f, 8.859f, 19.731f, 8.299f, 19.731f, 7.899f)
                verticalLineTo(6.199f)
                curveTo(19.731f, 5.139f, 18.861f, 4.269f, 17.801f, 4.269f)
                horizontalLineTo(16.101f)
                curveTo(15.711f, 4.269f, 15.141f, 4.059f, 14.841f, 3.799f)
                lineTo(13.261f, 2.439f)
                curveTo(12.571f, 1.849f, 11.441f, 1.849f, 10.741f, 2.439f)
                lineTo(9.171f, 3.809f)
                curveTo(8.871f, 4.059f, 8.301f, 4.269f, 7.911f, 4.269f)
                horizontalLineTo(6.181f)
                curveTo(5.121f, 4.269f, 4.251f, 5.139f, 4.251f, 6.199f)
                verticalLineTo(7.909f)
                curveTo(4.251f, 8.299f, 4.041f, 8.859f, 3.791f, 9.159f)
                lineTo(2.441f, 10.749f)
                curveTo(1.861f, 11.439f, 1.861f, 12.559f, 2.441f, 13.249f)
                lineTo(3.791f, 14.839f)
                curveTo(4.041f, 15.139f, 4.251f, 15.699f, 4.251f, 16.089f)
                verticalLineTo(17.799f)
                curveTo(4.251f, 18.859f, 5.121f, 19.729f, 6.181f, 19.729f)
                horizontalLineTo(7.911f)
                curveTo(8.301f, 19.729f, 8.871f, 19.939f, 9.171f, 20.199f)
                lineTo(10.751f, 21.559f)
                curveTo(11.441f, 22.149f, 12.571f, 22.149f, 13.271f, 21.559f)
                lineTo(14.851f, 20.199f)
                curveTo(15.151f, 19.939f, 15.711f, 19.729f, 16.111f, 19.729f)
                horizontalLineTo(17.811f)
                curveTo(18.871f, 19.729f, 19.741f, 18.859f, 19.741f, 17.799f)
                verticalLineTo(16.099f)
                curveTo(19.741f, 15.709f, 19.951f, 15.139f, 20.211f, 14.839f)
                lineTo(21.571f, 13.259f)
                curveTo(22.151f, 12.569f, 22.151f, 11.429f, 21.561f, 10.739f)
                close()
                moveTo(16.161f, 10.109f)
                lineTo(11.331f, 14.939f)
                curveTo(11.191f, 15.079f, 11.001f, 15.159f, 10.801f, 15.159f)
                curveTo(10.601f, 15.159f, 10.411f, 15.079f, 10.271f, 14.939f)
                lineTo(7.851f, 12.519f)
                curveTo(7.561f, 12.229f, 7.561f, 11.749f, 7.851f, 11.459f)
                curveTo(8.141f, 11.169f, 8.621f, 11.169f, 8.911f, 11.459f)
                lineTo(10.801f, 13.349f)
                lineTo(15.101f, 9.049f)
                curveTo(15.391f, 8.759f, 15.871f, 8.759f, 16.161f, 9.049f)
                curveTo(16.451f, 9.339f, 16.451f, 9.819f, 16.161f, 10.109f)
                close()
            }
        }.build()

        return _Verify!!
    }

@Suppress("ObjectPropertyName")
private var _Verify: ImageVector? = null
