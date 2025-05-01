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

val Iconsax.Outline.Paintbucket: ImageVector
    get() {
        if (_Paintbucket != null) {
            return _Paintbucket!!
        }
        _Paintbucket = ImageVector.Builder(
            name = "Outline.Paintbucket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.061f, 21.58f)
                curveTo(9.06f, 21.58f, 8.05f, 20.9f, 6.7f, 19.56f)
                lineTo(3.24f, 16.1f)
                curveTo(0.3f, 13.16f, 0.6f, 12.03f, 3.24f, 9.38f)
                lineTo(8.81f, 3.8f)
                curveTo(10.781f, 1.83f, 12.41f, 0.68f, 15.531f, 3.8f)
                lineTo(18.99f, 7.26f)
                curveTo(21.801f, 10.07f, 21.121f, 11.85f, 18.99f, 13.98f)
                lineTo(13.42f, 19.55f)
                curveTo(12.071f, 20.9f, 11.071f, 21.58f, 10.061f, 21.58f)
                close()
                moveTo(4.3f, 15.03f)
                lineTo(7.76f, 18.49f)
                curveTo(9.88f, 20.61f, 10.231f, 20.62f, 12.361f, 18.49f)
                lineTo(17.931f, 12.92f)
                curveTo(19.601f, 11.25f, 20.031f, 10.42f, 17.931f, 8.32f)
                lineTo(14.47f, 4.86f)
                curveTo(12.281f, 2.67f, 11.62f, 3.12f, 9.87f, 4.86f)
                lineTo(4.3f, 10.43f)
                curveTo(2.18f, 12.56f, 2f, 12.73f, 4.3f, 15.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.141f, 21.46f)
                curveTo(19.001f, 21.46f, 18.101f, 21.02f, 17.661f, 20.25f)
                curveTo(17.221f, 19.48f, 17.311f, 18.48f, 17.901f, 17.5f)
                lineTo(18.561f, 16.41f)
                curveTo(18.951f, 15.77f, 19.521f, 15.4f, 20.141f, 15.4f)
                curveTo(20.761f, 15.4f, 21.341f, 15.77f, 21.721f, 16.41f)
                lineTo(22.381f, 17.5f)
                curveTo(22.971f, 18.48f, 23.051f, 19.48f, 22.621f, 20.25f)
                curveTo(22.191f, 21.02f, 21.271f, 21.46f, 20.141f, 21.46f)
                close()
                moveTo(20.141f, 16.9f)
                curveTo(20.091f, 16.9f, 19.971f, 16.98f, 19.841f, 17.18f)
                lineTo(19.181f, 18.27f)
                curveTo(18.881f, 18.77f, 18.801f, 19.22f, 18.961f, 19.51f)
                curveTo(19.121f, 19.8f, 19.551f, 19.96f, 20.131f, 19.96f)
                curveTo(20.711f, 19.96f, 21.141f, 19.8f, 21.301f, 19.51f)
                curveTo(21.461f, 19.22f, 21.381f, 18.78f, 21.081f, 18.27f)
                lineTo(20.421f, 17.18f)
                curveTo(20.311f, 16.97f, 20.191f, 16.9f, 20.141f, 16.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.001f, 12.99f)
                curveTo(1.671f, 12.99f, 1.371f, 12.77f, 1.281f, 12.44f)
                curveTo(1.171f, 12.04f, 1.411f, 11.63f, 1.811f, 11.52f)
                curveTo(7.481f, 9.98f, 13.491f, 9.93f, 19.191f, 11.39f)
                lineTo(19.691f, 11.52f)
                curveTo(20.091f, 11.62f, 20.331f, 12.03f, 20.231f, 12.43f)
                curveTo(20.131f, 12.83f, 19.721f, 13.07f, 19.321f, 12.97f)
                lineTo(18.821f, 12.84f)
                curveTo(13.371f, 11.44f, 7.631f, 11.49f, 2.211f, 12.97f)
                curveTo(2.131f, 12.99f, 2.061f, 12.99f, 2.001f, 12.99f)
                close()
            }
        }.build()

        return _Paintbucket!!
    }

@Suppress("ObjectPropertyName")
private var _Paintbucket: ImageVector? = null
