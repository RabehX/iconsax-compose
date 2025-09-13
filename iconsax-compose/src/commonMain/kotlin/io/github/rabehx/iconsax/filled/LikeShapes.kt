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


val Iconsax.Filled.LikeShapes: ImageVector
    get() {
        if (_LikeShapes != null) {
            return _LikeShapes!!
        }
        _LikeShapes = ImageVector.Builder(
            name = "Filled.LikeShapes",
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
                moveTo(16.681f, 11.999f)
                lineTo(15.511f, 15.559f)
                curveTo(15.361f, 16.149f, 14.731f, 16.629f, 14.091f, 16.629f)
                horizontalLineTo(12.241f)
                curveTo(11.921f, 16.629f, 11.471f, 16.519f, 11.271f, 16.319f)
                lineTo(9.801f, 15.169f)
                curveTo(9.771f, 15.809f, 9.481f, 16.079f, 8.771f, 16.079f)
                horizontalLineTo(8.291f)
                curveTo(7.551f, 16.079f, 7.251f, 15.789f, 7.251f, 15.089f)
                verticalLineTo(10.309f)
                curveTo(7.251f, 9.609f, 7.551f, 9.319f, 8.291f, 9.319f)
                horizontalLineTo(8.781f)
                curveTo(9.521f, 9.319f, 9.821f, 9.609f, 9.821f, 10.309f)
                verticalLineTo(10.669f)
                lineTo(11.761f, 7.789f)
                curveTo(11.961f, 7.479f, 12.471f, 7.259f, 12.901f, 7.429f)
                curveTo(13.371f, 7.589f, 13.671f, 8.109f, 13.571f, 8.569f)
                lineTo(13.331f, 10.129f)
                curveTo(13.311f, 10.269f, 13.341f, 10.399f, 13.431f, 10.499f)
                curveTo(13.511f, 10.589f, 13.631f, 10.649f, 13.761f, 10.649f)
                horizontalLineTo(15.711f)
                curveTo(16.091f, 10.649f, 16.411f, 10.799f, 16.601f, 11.069f)
                curveTo(16.771f, 11.329f, 16.801f, 11.659f, 16.681f, 11.999f)
                close()
            }
        }.build()

        return _LikeShapes!!
    }

@Suppress("ObjectPropertyName")
private var _LikeShapes: ImageVector? = null
