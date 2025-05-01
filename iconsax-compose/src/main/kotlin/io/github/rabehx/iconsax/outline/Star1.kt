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

val Iconsax.Outline.Star1: ImageVector
    get() {
        if (_Star1 != null) {
            return _Star1!!
        }
        _Star1 = ImageVector.Builder(
            name = "Outline.Star1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.481f, 20.69f)
                curveTo(8.981f, 20.69f, 8.631f, 20.52f, 8.421f, 20.36f)
                curveTo(8.021f, 20.07f, 7.401f, 19.32f, 7.791f, 17.64f)
                lineTo(8.361f, 15.18f)
                curveTo(8.411f, 14.97f, 8.301f, 14.59f, 8.151f, 14.43f)
                lineTo(6.161f, 12.44f)
                curveTo(5.111f, 11.39f, 5.201f, 10.48f, 5.341f, 10.03f)
                curveTo(5.481f, 9.58f, 5.941f, 8.79f, 7.401f, 8.54f)
                lineTo(9.951f, 8.12f)
                curveTo(10.141f, 8.09f, 10.451f, 7.86f, 10.531f, 7.69f)
                lineTo(11.941f, 4.87f)
                curveTo(12.621f, 3.51f, 13.521f, 3.31f, 14.001f, 3.31f)
                curveTo(14.481f, 3.31f, 15.381f, 3.51f, 16.061f, 4.87f)
                lineTo(17.471f, 7.69f)
                curveTo(17.561f, 7.86f, 17.861f, 8.09f, 18.051f, 8.12f)
                lineTo(20.601f, 8.54f)
                curveTo(22.061f, 8.78f, 22.521f, 9.58f, 22.661f, 10.03f)
                curveTo(22.801f, 10.48f, 22.891f, 11.39f, 21.841f, 12.44f)
                lineTo(19.851f, 14.43f)
                curveTo(19.701f, 14.58f, 19.591f, 14.97f, 19.641f, 15.18f)
                lineTo(20.211f, 17.64f)
                curveTo(20.601f, 19.33f, 19.981f, 20.07f, 19.581f, 20.36f)
                curveTo(19.181f, 20.65f, 18.291f, 21.02f, 16.791f, 20.13f)
                lineTo(14.401f, 18.71f)
                curveTo(14.201f, 18.59f, 13.781f, 18.59f, 13.581f, 18.71f)
                lineTo(11.191f, 20.13f)
                curveTo(10.501f, 20.55f, 9.921f, 20.69f, 9.481f, 20.69f)
                close()
                moveTo(14.001f, 4.81f)
                curveTo(13.841f, 4.81f, 13.551f, 5f, 13.281f, 5.54f)
                lineTo(11.871f, 8.36f)
                curveTo(11.571f, 8.97f, 10.861f, 9.49f, 10.191f, 9.6f)
                lineTo(7.641f, 10.02f)
                curveTo(7.071f, 10.12f, 6.811f, 10.33f, 6.761f, 10.49f)
                curveTo(6.711f, 10.65f, 6.801f, 10.97f, 7.211f, 11.38f)
                lineTo(9.201f, 13.37f)
                curveTo(9.711f, 13.88f, 9.981f, 14.81f, 9.821f, 15.51f)
                lineTo(9.251f, 17.97f)
                curveTo(9.081f, 18.68f, 9.191f, 19.06f, 9.301f, 19.15f)
                curveTo(9.411f, 19.23f, 9.811f, 19.22f, 10.431f, 18.84f)
                lineTo(12.831f, 17.42f)
                curveTo(13.501f, 17.02f, 14.511f, 17.02f, 15.171f, 17.42f)
                lineTo(17.561f, 18.84f)
                curveTo(18.191f, 19.21f, 18.591f, 19.23f, 18.701f, 19.15f)
                curveTo(18.811f, 19.07f, 18.921f, 18.69f, 18.751f, 17.97f)
                lineTo(18.181f, 15.51f)
                curveTo(18.021f, 14.8f, 18.281f, 13.88f, 18.801f, 13.37f)
                lineTo(20.791f, 11.38f)
                curveTo(21.201f, 10.97f, 21.291f, 10.64f, 21.241f, 10.49f)
                curveTo(21.191f, 10.34f, 20.931f, 10.12f, 20.361f, 10.02f)
                lineTo(17.811f, 9.6f)
                curveTo(17.141f, 9.49f, 16.431f, 8.97f, 16.131f, 8.36f)
                lineTo(14.721f, 5.54f)
                curveTo(14.451f, 5f, 14.161f, 4.81f, 14.001f, 4.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 5.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 5.75f, 1.25f, 5.41f, 1.25f, 5f)
                curveTo(1.25f, 4.59f, 1.59f, 4.25f, 2f, 4.25f)
                horizontalLineTo(8f)
                curveTo(8.41f, 4.25f, 8.75f, 4.59f, 8.75f, 5f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 19.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 19.75f, 1.25f, 19.41f, 1.25f, 19f)
                curveTo(1.25f, 18.59f, 1.59f, 18.25f, 2f, 18.25f)
                horizontalLineTo(5f)
                curveTo(5.41f, 18.25f, 5.75f, 18.59f, 5.75f, 19f)
                curveTo(5.75f, 19.41f, 5.41f, 19.75f, 5f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 12.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2f, 11.25f)
                horizontalLineTo(3f)
                curveTo(3.41f, 11.25f, 3.75f, 11.59f, 3.75f, 12f)
                curveTo(3.75f, 12.41f, 3.41f, 12.75f, 3f, 12.75f)
                close()
            }
        }.build()

        return _Star1!!
    }

@Suppress("ObjectPropertyName")
private var _Star1: ImageVector? = null
