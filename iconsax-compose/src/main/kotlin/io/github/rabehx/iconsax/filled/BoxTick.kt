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


val Iconsax.Filled.BoxTick: ImageVector
    get() {
        if (_BoxTick != null) {
            return _BoxTick!!
        }
        _BoxTick = ImageVector.Builder(
            name = "Filled.BoxTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.601f, 5.311f)
                lineTo(11.95f, 2.271f)
                curveTo(11.351f, 1.951f, 10.641f, 1.951f, 10.04f, 2.271f)
                lineTo(4.4f, 5.311f)
                curveTo(3.99f, 5.541f, 3.73f, 5.981f, 3.73f, 6.461f)
                curveTo(3.73f, 6.951f, 3.98f, 7.391f, 4.4f, 7.611f)
                lineTo(10.05f, 10.651f)
                curveTo(10.351f, 10.811f, 10.681f, 10.891f, 11f, 10.891f)
                curveTo(11.321f, 10.891f, 11.66f, 10.811f, 11.95f, 10.651f)
                lineTo(17.601f, 7.611f)
                curveTo(18.01f, 7.391f, 18.271f, 6.951f, 18.271f, 6.461f)
                curveTo(18.271f, 5.981f, 18.01f, 5.541f, 17.601f, 5.311f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.12f, 11.711f)
                lineTo(3.87f, 9.091f)
                curveTo(3.46f, 8.881f, 3f, 8.911f, 2.61f, 9.141f)
                curveTo(2.23f, 9.381f, 2f, 9.791f, 2f, 10.241f)
                verticalLineTo(15.201f)
                curveTo(2f, 16.061f, 2.48f, 16.831f, 3.25f, 17.221f)
                lineTo(8.5f, 19.841f)
                curveTo(8.68f, 19.931f, 8.88f, 19.981f, 9.08f, 19.981f)
                curveTo(9.31f, 19.981f, 9.55f, 19.911f, 9.76f, 19.791f)
                curveTo(10.14f, 19.551f, 10.37f, 19.141f, 10.37f, 18.691f)
                verticalLineTo(13.731f)
                curveTo(10.36f, 12.871f, 9.88f, 12.101f, 9.12f, 11.711f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.001f, 10.241f)
                verticalLineTo(12.701f)
                curveTo(19.521f, 12.561f, 19.011f, 12.501f, 18.501f, 12.501f)
                curveTo(17.141f, 12.501f, 15.811f, 12.971f, 14.761f, 13.811f)
                curveTo(13.321f, 14.941f, 12.501f, 16.651f, 12.501f, 18.501f)
                curveTo(12.501f, 18.991f, 12.561f, 19.481f, 12.691f, 19.951f)
                curveTo(12.541f, 19.931f, 12.391f, 19.871f, 12.251f, 19.781f)
                curveTo(11.871f, 19.551f, 11.641f, 19.141f, 11.641f, 18.691f)
                verticalLineTo(13.731f)
                curveTo(11.641f, 12.871f, 12.121f, 12.101f, 12.881f, 11.711f)
                lineTo(18.131f, 9.091f)
                curveTo(18.541f, 8.881f, 19.001f, 8.911f, 19.391f, 9.141f)
                curveTo(19.771f, 9.381f, 20.001f, 9.791f, 20.001f, 10.241f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.98f, 15.67f)
                curveTo(21.16f, 14.66f, 19.91f, 14.019f, 18.5f, 14.019f)
                curveTo(17.44f, 14.019f, 16.46f, 14.389f, 15.69f, 15.009f)
                curveTo(14.65f, 15.83f, 14f, 17.1f, 14f, 18.52f)
                curveTo(14f, 19.36f, 14.24f, 20.16f, 14.65f, 20.84f)
                curveTo(14.92f, 21.289f, 15.26f, 21.68f, 15.66f, 22f)
                horizontalLineTo(15.67f)
                curveTo(16.44f, 22.639f, 17.43f, 23.02f, 18.5f, 23.02f)
                curveTo(19.64f, 23.02f, 20.67f, 22.6f, 21.46f, 21.899f)
                curveTo(21.81f, 21.6f, 22.11f, 21.24f, 22.35f, 20.84f)
                curveTo(22.76f, 20.16f, 23f, 19.36f, 23f, 18.52f)
                curveTo(23f, 17.44f, 22.62f, 16.44f, 21.98f, 15.67f)
                close()
                moveTo(20.76f, 17.959f)
                lineTo(18.36f, 20.18f)
                curveTo(18.22f, 20.309f, 18.03f, 20.379f, 17.85f, 20.379f)
                curveTo(17.66f, 20.379f, 17.47f, 20.309f, 17.32f, 20.16f)
                lineTo(16.21f, 19.049f)
                curveTo(15.92f, 18.76f, 15.92f, 18.279f, 16.21f, 17.99f)
                curveTo(16.5f, 17.699f, 16.98f, 17.699f, 17.27f, 17.99f)
                lineTo(17.87f, 18.59f)
                lineTo(19.74f, 16.86f)
                curveTo(20.04f, 16.58f, 20.52f, 16.6f, 20.8f, 16.899f)
                curveTo(21.09f, 17.209f, 21.07f, 17.68f, 20.76f, 17.959f)
                close()
            }
        }.build()

        return _BoxTick!!
    }

@Suppress("ObjectPropertyName")
private var _BoxTick: ImageVector? = null
