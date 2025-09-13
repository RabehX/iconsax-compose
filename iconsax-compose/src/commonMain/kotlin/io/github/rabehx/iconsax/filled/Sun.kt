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


val Iconsax.Filled.Sun: ImageVector
    get() {
        if (_Sun != null) {
            return _Sun!!
        }
        _Sun = ImageVector.Builder(
            name = "Filled.Sun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 3.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(8.5f)
                curveTo(11.25f, 8.91f, 11.59f, 9.25f, 12f, 9.25f)
                curveTo(12.41f, 9.25f, 12.75f, 8.91f, 12.75f, 8.5f)
                verticalLineTo(3.75f)
                horizontalLineTo(14f)
                curveTo(14.41f, 3.75f, 14.75f, 3.41f, 14.75f, 3f)
                curveTo(14.75f, 2.59f, 14.41f, 2.25f, 14f, 2.25f)
                horizontalLineTo(10f)
                curveTo(9.59f, 2.25f, 9.25f, 2.59f, 9.25f, 3f)
                curveTo(9.25f, 3.41f, 9.59f, 3.75f, 10f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 20.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(15.5f)
                curveTo(12.75f, 15.09f, 12.41f, 14.75f, 12f, 14.75f)
                curveTo(11.59f, 14.75f, 11.25f, 15.09f, 11.25f, 15.5f)
                verticalLineTo(20.25f)
                horizontalLineTo(10f)
                curveTo(9.59f, 20.25f, 9.25f, 20.59f, 9.25f, 21f)
                curveTo(9.25f, 21.41f, 9.59f, 21.75f, 10f, 21.75f)
                horizontalLineTo(14f)
                curveTo(14.41f, 21.75f, 14.75f, 21.41f, 14.75f, 21f)
                curveTo(14.75f, 20.59f, 14.41f, 20.25f, 14f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.83f, 9.879f)
                curveTo(2.95f, 9.949f, 3.08f, 9.979f, 3.2f, 9.979f)
                curveTo(3.46f, 9.979f, 3.71f, 9.849f, 3.85f, 9.599f)
                lineTo(4.48f, 8.519f)
                lineTo(8.6f, 10.899f)
                curveTo(8.71f, 10.969f, 8.84f, 10.999f, 8.97f, 10.999f)
                curveTo(9.23f, 10.999f, 9.48f, 10.869f, 9.62f, 10.619f)
                curveTo(9.83f, 10.269f, 9.7f, 9.809f, 9.35f, 9.599f)
                lineTo(5.23f, 7.219f)
                lineTo(5.85f, 6.139f)
                curveTo(6.06f, 5.779f, 5.93f, 5.319f, 5.58f, 5.119f)
                curveTo(5.22f, 4.909f, 4.76f, 5.029f, 4.56f, 5.389f)
                lineTo(2.56f, 8.849f)
                curveTo(2.35f, 9.219f, 2.47f, 9.669f, 2.83f, 9.879f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.169f, 14.121f)
                curveTo(20.809f, 13.911f, 20.348f, 14.031f, 20.149f, 14.391f)
                lineTo(19.518f, 15.471f)
                lineTo(15.399f, 13.101f)
                curveTo(15.038f, 12.891f, 14.578f, 13.021f, 14.378f, 13.371f)
                curveTo(14.168f, 13.731f, 14.299f, 14.191f, 14.649f, 14.391f)
                lineTo(18.758f, 16.771f)
                lineTo(18.139f, 17.851f)
                curveTo(17.928f, 18.211f, 18.059f, 18.671f, 18.409f, 18.871f)
                curveTo(18.528f, 18.941f, 18.659f, 18.971f, 18.778f, 18.971f)
                curveTo(19.038f, 18.971f, 19.288f, 18.841f, 19.428f, 18.591f)
                lineTo(21.428f, 15.131f)
                curveTo(21.649f, 14.781f, 21.528f, 14.331f, 21.169f, 14.121f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.771f, 7.221f)
                lineTo(14.651f, 9.601f)
                curveTo(14.291f, 9.811f, 14.171f, 10.271f, 14.381f, 10.621f)
                curveTo(14.521f, 10.861f, 14.771f, 11.001f, 15.031f, 11.001f)
                curveTo(15.161f, 11.001f, 15.291f, 10.971f, 15.401f, 10.901f)
                lineTo(19.511f, 8.521f)
                lineTo(20.141f, 9.601f)
                curveTo(20.281f, 9.841f, 20.531f, 9.981f, 20.791f, 9.981f)
                curveTo(20.921f, 9.981f, 21.051f, 9.951f, 21.161f, 9.881f)
                curveTo(21.521f, 9.671f, 21.641f, 9.211f, 21.431f, 8.861f)
                lineTo(19.431f, 5.401f)
                curveTo(19.221f, 5.041f, 18.761f, 4.921f, 18.411f, 5.131f)
                curveTo(18.051f, 5.341f, 17.931f, 5.801f, 18.141f, 6.151f)
                lineTo(18.771f, 7.221f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.23f, 16.781f)
                lineTo(9.34f, 14.401f)
                curveTo(9.7f, 14.191f, 9.82f, 13.731f, 9.61f, 13.381f)
                curveTo(9.4f, 13.021f, 8.94f, 12.901f, 8.59f, 13.111f)
                lineTo(4.48f, 15.491f)
                lineTo(3.85f, 14.411f)
                curveTo(3.64f, 14.051f, 3.18f, 13.931f, 2.83f, 14.141f)
                curveTo(2.47f, 14.351f, 2.35f, 14.811f, 2.56f, 15.161f)
                lineTo(4.56f, 18.621f)
                curveTo(4.7f, 18.861f, 4.95f, 19.001f, 5.21f, 19.001f)
                curveTo(5.34f, 19.001f, 5.47f, 18.971f, 5.58f, 18.901f)
                curveTo(5.94f, 18.691f, 6.06f, 18.231f, 5.85f, 17.881f)
                lineTo(5.23f, 16.781f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 12f)
                curveTo(15.5f, 12.64f, 15.33f, 13.23f, 15.03f, 13.75f)
                curveTo(14.42f, 14.8f, 13.29f, 15.5f, 12f, 15.5f)
                curveTo(10.71f, 15.5f, 9.58f, 14.8f, 8.97f, 13.75f)
                curveTo(8.67f, 13.23f, 8.5f, 12.64f, 8.5f, 12f)
                curveTo(8.5f, 11.36f, 8.67f, 10.77f, 8.97f, 10.25f)
                curveTo(9.58f, 9.2f, 10.71f, 8.5f, 12f, 8.5f)
                curveTo(13.29f, 8.5f, 14.42f, 9.2f, 15.03f, 10.25f)
                curveTo(15.33f, 10.77f, 15.5f, 11.36f, 15.5f, 12f)
                close()
            }
        }.build()

        return _Sun!!
    }

@Suppress("ObjectPropertyName")
private var _Sun: ImageVector? = null
