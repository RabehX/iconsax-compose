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


val Iconsax.Filled.Forward5Seconds: ImageVector
    get() {
        if (_Forward5Seconds != null) {
            return _Forward5Seconds!!
        }
        _Forward5Seconds = ImageVector.Builder(
            name = "Filled.Forward5Seconds",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.479f, 7.091f)
                curveTo(19.219f, 6.771f, 18.749f, 6.721f, 18.429f, 6.981f)
                curveTo(18.109f, 7.241f, 18.059f, 7.711f, 18.319f, 8.031f)
                curveTo(19.449f, 9.431f, 20.079f, 11.09f, 20.139f, 12.83f)
                curveTo(20.299f, 17.31f, 16.779f, 21.09f, 12.289f, 21.24f)
                curveTo(7.799f, 21.4f, 4.029f, 17.881f, 3.869f, 13.401f)
                curveTo(3.709f, 8.921f, 7.229f, 5.141f, 11.719f, 4.991f)
                curveTo(12.289f, 4.971f, 12.889f, 5.021f, 13.539f, 5.151f)
                curveTo(13.579f, 5.161f, 13.619f, 5.151f, 13.659f, 5.151f)
                curveTo(13.759f, 5.201f, 13.879f, 5.231f, 13.989f, 5.231f)
                curveTo(14.159f, 5.231f, 14.319f, 5.181f, 14.459f, 5.061f)
                curveTo(14.779f, 4.801f, 14.829f, 4.331f, 14.579f, 4.011f)
                lineTo(12.599f, 1.541f)
                curveTo(12.339f, 1.221f, 11.869f, 1.161f, 11.549f, 1.421f)
                curveTo(11.229f, 1.681f, 11.179f, 2.151f, 11.429f, 2.471f)
                lineTo(12.259f, 3.501f)
                curveTo(12.069f, 3.491f, 11.869f, 3.481f, 11.679f, 3.491f)
                curveTo(6.369f, 3.671f, 2.199f, 8.151f, 2.389f, 13.46f)
                curveTo(2.579f, 18.771f, 7.049f, 22.941f, 12.359f, 22.75f)
                curveTo(17.669f, 22.56f, 21.839f, 18.09f, 21.649f, 12.781f)
                curveTo(21.559f, 10.71f, 20.819f, 8.741f, 19.479f, 7.091f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.381f, 16.92f)
                horizontalLineTo(10.091f)
                curveTo(9.681f, 16.92f, 9.341f, 16.58f, 9.341f, 16.17f)
                curveTo(9.341f, 15.76f, 9.681f, 15.42f, 10.091f, 15.42f)
                horizontalLineTo(12.381f)
                curveTo(12.811f, 15.42f, 13.161f, 15.07f, 13.161f, 14.64f)
                curveTo(13.161f, 14.21f, 12.811f, 13.86f, 12.381f, 13.86f)
                horizontalLineTo(10.091f)
                curveTo(9.851f, 13.86f, 9.621f, 13.74f, 9.481f, 13.55f)
                curveTo(9.341f, 13.36f, 9.301f, 13.1f, 9.381f, 12.87f)
                lineTo(10.141f, 10.58f)
                curveTo(10.241f, 10.27f, 10.531f, 10.07f, 10.851f, 10.07f)
                horizontalLineTo(13.911f)
                curveTo(14.321f, 10.07f, 14.661f, 10.41f, 14.661f, 10.82f)
                curveTo(14.661f, 11.23f, 14.321f, 11.57f, 13.911f, 11.57f)
                horizontalLineTo(11.391f)
                lineTo(11.131f, 12.36f)
                horizontalLineTo(12.381f)
                curveTo(13.641f, 12.36f, 14.661f, 13.38f, 14.661f, 14.64f)
                curveTo(14.661f, 15.9f, 13.641f, 16.92f, 12.381f, 16.92f)
                close()
            }
        }.build()

        return _Forward5Seconds!!
    }

@Suppress("ObjectPropertyName")
private var _Forward5Seconds: ImageVector? = null
