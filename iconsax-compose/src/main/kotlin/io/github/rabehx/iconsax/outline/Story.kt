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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.Story: ImageVector
    get() {
        if (_Story != null) {
            return _Story!!
        }
        _Story = ImageVector.Builder(
            name = "Outline.Story",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.37f)
                curveTo(10.21f, 19.37f, 8.419f, 18.69f, 7.049f, 17.32f)
                curveTo(4.319f, 14.59f, 4.319f, 10.15f, 7.049f, 7.42f)
                curveTo(9.779f, 4.69f, 14.219f, 4.69f, 16.949f, 7.42f)
                curveTo(19.68f, 10.15f, 19.68f, 14.59f, 16.949f, 17.32f)
                curveTo(15.58f, 18.69f, 13.79f, 19.37f, 12f, 19.37f)
                close()
                moveTo(12f, 6.87f)
                curveTo(10.59f, 6.87f, 9.179f, 7.41f, 8.109f, 8.48f)
                curveTo(5.969f, 10.63f, 5.969f, 14.11f, 8.109f, 16.26f)
                curveTo(10.259f, 18.41f, 13.75f, 18.4f, 15.889f, 16.26f)
                curveTo(18.029f, 14.11f, 18.029f, 10.63f, 15.889f, 8.48f)
                curveTo(14.819f, 7.41f, 13.41f, 6.87f, 12f, 6.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.249f, 22.39f)
                curveTo(8.159f, 22.39f, 8.059f, 22.37f, 7.969f, 22.34f)
                curveTo(5.719f, 21.44f, 3.899f, 19.85f, 2.679f, 17.75f)
                curveTo(1.499f, 15.7f, 1.029f, 13.38f, 1.339f, 11.02f)
                curveTo(1.389f, 10.61f, 1.769f, 10.32f, 2.179f, 10.37f)
                curveTo(2.589f, 10.42f, 2.879f, 10.8f, 2.829f, 11.21f)
                curveTo(2.569f, 13.23f, 2.969f, 15.23f, 3.979f, 16.99f)
                curveTo(5.019f, 18.79f, 6.589f, 20.16f, 8.519f, 20.93f)
                curveTo(8.899f, 21.09f, 9.089f, 21.52f, 8.939f, 21.91f)
                curveTo(8.829f, 22.21f, 8.539f, 22.39f, 8.249f, 22.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.85f, 5.23f)
                curveTo(5.63f, 5.23f, 5.41f, 5.13f, 5.26f, 4.94f)
                curveTo(5f, 4.61f, 5.06f, 4.14f, 5.39f, 3.89f)
                curveTo(7.3f, 2.4f, 9.58f, 1.61f, 12f, 1.61f)
                curveTo(14.36f, 1.61f, 16.61f, 2.37f, 18.5f, 3.81f)
                curveTo(18.83f, 4.06f, 18.89f, 4.53f, 18.64f, 4.86f)
                curveTo(18.39f, 5.19f, 17.92f, 5.25f, 17.59f, 5f)
                curveTo(15.97f, 3.76f, 14.04f, 3.11f, 12f, 3.11f)
                curveTo(9.92f, 3.11f, 7.95f, 3.79f, 6.31f, 5.07f)
                curveTo(6.17f, 5.18f, 6.01f, 5.23f, 5.85f, 5.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.751f, 22.39f)
                curveTo(15.451f, 22.39f, 15.171f, 22.21f, 15.051f, 21.92f)
                curveTo(14.901f, 21.54f, 15.081f, 21.1f, 15.471f, 20.94f)
                curveTo(17.401f, 20.16f, 18.971f, 18.8f, 20.011f, 17f)
                curveTo(21.031f, 15.24f, 21.431f, 13.24f, 21.161f, 11.22f)
                curveTo(21.111f, 10.81f, 21.401f, 10.43f, 21.811f, 10.38f)
                curveTo(22.211f, 10.33f, 22.601f, 10.62f, 22.651f, 11.03f)
                curveTo(22.951f, 13.38f, 22.491f, 15.71f, 21.311f, 17.76f)
                curveTo(20.101f, 19.86f, 18.271f, 21.44f, 16.021f, 22.35f)
                curveTo(15.941f, 22.37f, 15.851f, 22.39f, 15.751f, 22.39f)
                close()
            }
        }.build()

        return _Story!!
    }

@Suppress("ObjectPropertyName")
private var _Story: ImageVector? = null
