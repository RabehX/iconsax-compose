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


val Iconsax.Filled.Box2: ImageVector
    get() {
        if (_Box2 != null) {
            return _Box2!!
        }
        _Box2 = ImageVector.Builder(
            name = "Filled.Box2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.329f, 19.421f)
                curveTo(5.219f, 19.421f, 5.099f, 19.391f, 4.999f, 19.341f)
                lineTo(2.779f, 18.231f)
                curveTo(2.529f, 18.101f, 2.369f, 17.841f, 2.369f, 17.561f)
                verticalLineTo(14.781f)
                curveTo(2.369f, 14.371f, 2.709f, 14.031f, 3.119f, 14.031f)
                curveTo(3.529f, 14.031f, 3.869f, 14.371f, 3.869f, 14.781f)
                verticalLineTo(17.091f)
                lineTo(5.669f, 18.001f)
                curveTo(6.039f, 18.181f, 6.189f, 18.631f, 5.999f, 19.001f)
                curveTo(5.869f, 19.261f, 5.609f, 19.421f, 5.329f, 19.421f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.749f)
                curveTo(11.939f, 22.749f, 11.88f, 22.739f, 11.83f, 22.729f)
                curveTo(11.769f, 22.719f, 11.71f, 22.689f, 11.649f, 22.659f)
                lineTo(9.439f, 21.559f)
                curveTo(9.069f, 21.369f, 8.919f, 20.919f, 9.099f, 20.549f)
                curveTo(9.289f, 20.179f, 9.739f, 20.029f, 10.109f, 20.209f)
                lineTo(11.25f, 20.779f)
                verticalLineTo(19.219f)
                curveTo(11.25f, 18.809f, 11.59f, 18.469f, 12f, 18.469f)
                curveTo(12.41f, 18.469f, 12.75f, 18.809f, 12.75f, 19.219f)
                verticalLineTo(20.779f)
                lineTo(13.889f, 20.209f)
                curveTo(14.259f, 20.029f, 14.71f, 20.179f, 14.899f, 20.549f)
                curveTo(15.09f, 20.919f, 14.939f, 21.369f, 14.559f, 21.559f)
                lineTo(12.349f, 22.659f)
                curveTo(12.29f, 22.689f, 12.229f, 22.709f, 12.17f, 22.729f)
                curveTo(12.109f, 22.739f, 12.059f, 22.749f, 12f, 22.749f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.67f, 19.419f)
                curveTo(18.4f, 19.419f, 18.13f, 19.269f, 18f, 19.009f)
                curveTo(17.81f, 18.639f, 17.96f, 18.189f, 18.34f, 17.999f)
                lineTo(20.15f, 17.099f)
                verticalLineTo(14.789f)
                curveTo(20.15f, 14.379f, 20.49f, 14.039f, 20.9f, 14.039f)
                curveTo(21.31f, 14.039f, 21.65f, 14.379f, 21.65f, 14.789f)
                verticalLineTo(17.569f)
                curveTo(21.65f, 17.849f, 21.49f, 18.109f, 21.24f, 18.239f)
                lineTo(19f, 19.339f)
                curveTo(18.89f, 19.389f, 18.78f, 19.419f, 18.67f, 19.419f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.419f)
                curveTo(11.59f, 14.419f, 11.25f, 14.079f, 11.25f, 13.669f)
                verticalLineTo(11.359f)
                lineTo(9.439f, 10.459f)
                curveTo(9.069f, 10.269f, 8.919f, 9.819f, 9.099f, 9.449f)
                curveTo(9.289f, 9.079f, 9.739f, 8.929f, 10.109f, 9.109f)
                lineTo(12f, 10.049f)
                lineTo(13.889f, 9.109f)
                curveTo(14.259f, 8.929f, 14.71f, 9.069f, 14.899f, 9.449f)
                curveTo(15.09f, 9.819f, 14.939f, 10.269f, 14.559f, 10.459f)
                lineTo(12.75f, 11.359f)
                verticalLineTo(13.669f)
                curveTo(12.75f, 14.079f, 12.41f, 14.419f, 12f, 14.419f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.109f, 9.968f)
                curveTo(2.699f, 9.968f, 2.359f, 9.628f, 2.359f, 9.218f)
                verticalLineTo(6.458f)
                verticalLineTo(6.448f)
                curveTo(2.359f, 6.388f, 2.369f, 6.328f, 2.379f, 6.278f)
                curveTo(2.399f, 6.188f, 2.429f, 6.118f, 2.469f, 6.048f)
                curveTo(2.499f, 5.998f, 2.539f, 5.958f, 2.579f, 5.918f)
                curveTo(2.619f, 5.878f, 2.669f, 5.838f, 2.719f, 5.808f)
                curveTo(2.739f, 5.798f, 2.769f, 5.778f, 2.789f, 5.768f)
                lineTo(4.999f, 4.658f)
                curveTo(5.369f, 4.478f, 5.819f, 4.628f, 5.999f, 4.998f)
                curveTo(6.189f, 5.368f, 6.039f, 5.818f, 5.669f, 5.998f)
                lineTo(4.789f, 6.438f)
                lineTo(5.669f, 6.878f)
                curveTo(6.039f, 7.068f, 6.189f, 7.518f, 5.999f, 7.888f)
                curveTo(5.819f, 8.258f, 5.369f, 8.408f, 4.999f, 8.228f)
                lineTo(3.859f, 7.658f)
                verticalLineTo(9.218f)
                curveTo(3.859f, 9.638f, 3.529f, 9.968f, 3.109f, 9.968f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.22f, 3.859f)
                curveTo(14.11f, 3.859f, 13.99f, 3.829f, 13.89f, 3.779f)
                lineTo(12f, 2.839f)
                lineTo(10.11f, 3.779f)
                curveTo(9.74f, 3.969f, 9.29f, 3.819f, 9.11f, 3.449f)
                curveTo(8.92f, 3.079f, 9.07f, 2.629f, 9.44f, 2.439f)
                lineTo(11.66f, 1.329f)
                curveTo(11.87f, 1.219f, 12.12f, 1.219f, 12.33f, 1.329f)
                lineTo(14.55f, 2.439f)
                curveTo(14.92f, 2.629f, 15.07f, 3.079f, 14.89f, 3.449f)
                curveTo(14.76f, 3.709f, 14.5f, 3.859f, 14.22f, 3.859f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.89f, 9.968f)
                curveTo(20.48f, 9.968f, 20.14f, 9.628f, 20.14f, 9.218f)
                verticalLineTo(7.658f)
                lineTo(19f, 8.228f)
                curveTo(18.63f, 8.408f, 18.18f, 8.258f, 18f, 7.888f)
                curveTo(17.81f, 7.518f, 17.96f, 7.068f, 18.34f, 6.878f)
                lineTo(19.22f, 6.438f)
                lineTo(18.33f, 5.998f)
                curveTo(17.96f, 5.818f, 17.81f, 5.368f, 18f, 4.998f)
                curveTo(18.19f, 4.628f, 18.63f, 4.478f, 19f, 4.658f)
                lineTo(21.21f, 5.758f)
                curveTo(21.23f, 5.768f, 21.26f, 5.778f, 21.28f, 5.798f)
                curveTo(21.34f, 5.828f, 21.39f, 5.878f, 21.44f, 5.928f)
                curveTo(21.47f, 5.968f, 21.5f, 6.008f, 21.53f, 6.048f)
                curveTo(21.57f, 6.118f, 21.6f, 6.188f, 21.62f, 6.268f)
                curveTo(21.63f, 6.328f, 21.64f, 6.388f, 21.64f, 6.438f)
                verticalLineTo(6.448f)
                verticalLineTo(9.208f)
                curveTo(21.64f, 9.638f, 21.3f, 9.968f, 20.89f, 9.968f)
                close()
            }
        }.build()

        return _Box2!!
    }

@Suppress("ObjectPropertyName")
private var _Box2: ImageVector? = null
