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


val Iconsax.Filled.Story: ImageVector
    get() {
        if (_Story != null) {
            return _Story!!
        }
        _Story = ImageVector.Builder(
            name = "Filled.Story",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.42f, 7.951f)
                curveTo(18.86f, 10.391f, 18.86f, 14.351f, 16.42f, 16.791f)
                curveTo(13.98f, 19.231f, 10.02f, 19.231f, 7.58f, 16.791f)
                curveTo(5.14f, 14.351f, 5.14f, 10.391f, 7.58f, 7.951f)
                curveTo(10.02f, 5.511f, 13.98f, 5.511f, 16.42f, 7.951f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.249f, 22.389f)
                curveTo(8.159f, 22.389f, 8.059f, 22.369f, 7.969f, 22.339f)
                curveTo(5.719f, 21.439f, 3.899f, 19.849f, 2.679f, 17.749f)
                curveTo(1.499f, 15.699f, 1.029f, 13.379f, 1.339f, 11.019f)
                curveTo(1.389f, 10.609f, 1.779f, 10.319f, 2.179f, 10.369f)
                curveTo(2.589f, 10.419f, 2.879f, 10.799f, 2.829f, 11.209f)
                curveTo(2.569f, 13.239f, 2.969f, 15.239f, 3.979f, 16.999f)
                curveTo(5.019f, 18.799f, 6.589f, 20.169f, 8.519f, 20.939f)
                curveTo(8.899f, 21.099f, 9.089f, 21.529f, 8.939f, 21.919f)
                curveTo(8.829f, 22.209f, 8.539f, 22.389f, 8.249f, 22.389f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.85f, 5.229f)
                curveTo(5.63f, 5.229f, 5.41f, 5.129f, 5.26f, 4.939f)
                curveTo(5f, 4.619f, 5.06f, 4.149f, 5.39f, 3.889f)
                curveTo(7.29f, 2.399f, 9.58f, 1.609f, 12f, 1.609f)
                curveTo(14.36f, 1.609f, 16.61f, 2.369f, 18.5f, 3.809f)
                curveTo(18.83f, 4.059f, 18.89f, 4.529f, 18.64f, 4.859f)
                curveTo(18.39f, 5.189f, 17.92f, 5.249f, 17.59f, 4.999f)
                curveTo(15.96f, 3.759f, 14.03f, 3.109f, 12f, 3.109f)
                curveTo(9.92f, 3.109f, 7.95f, 3.789f, 6.31f, 5.069f)
                curveTo(6.17f, 5.179f, 6.01f, 5.229f, 5.85f, 5.229f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.751f, 22.391f)
                curveTo(15.451f, 22.391f, 15.171f, 22.211f, 15.051f, 21.921f)
                curveTo(14.901f, 21.541f, 15.081f, 21.101f, 15.471f, 20.941f)
                curveTo(17.401f, 20.161f, 18.971f, 18.801f, 20.011f, 17.001f)
                curveTo(21.031f, 15.241f, 21.431f, 13.241f, 21.161f, 11.221f)
                curveTo(21.111f, 10.811f, 21.401f, 10.431f, 21.811f, 10.381f)
                curveTo(22.211f, 10.331f, 22.601f, 10.621f, 22.651f, 11.031f)
                curveTo(22.951f, 13.381f, 22.491f, 15.711f, 21.311f, 17.761f)
                curveTo(20.101f, 19.861f, 18.271f, 21.441f, 16.021f, 22.351f)
                curveTo(15.941f, 22.371f, 15.851f, 22.391f, 15.751f, 22.391f)
                close()
            }
        }.build()

        return _Story!!
    }

@Suppress("ObjectPropertyName")
private var _Story: ImageVector? = null
