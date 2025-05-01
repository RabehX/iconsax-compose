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


val Iconsax.Filled.ProfileRemove: ImageVector
    get() {
        if (_ProfileRemove != null) {
            return _ProfileRemove!!
        }
        _ProfileRemove = ImageVector.Builder(
            name = "Filled.ProfileRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(9.38f, 2f, 7.25f, 4.13f, 7.25f, 6.75f)
                curveTo(7.25f, 9.32f, 9.26f, 11.4f, 11.88f, 11.49f)
                curveTo(11.96f, 11.48f, 12.04f, 11.48f, 12.1f, 11.49f)
                curveTo(12.12f, 11.49f, 12.13f, 11.49f, 12.15f, 11.49f)
                curveTo(12.16f, 11.49f, 12.16f, 11.49f, 12.17f, 11.49f)
                curveTo(14.73f, 11.4f, 16.74f, 9.32f, 16.75f, 6.75f)
                curveTo(16.75f, 4.13f, 14.62f, 2f, 12f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.081f, 14.161f)
                curveTo(14.291f, 12.301f, 9.741f, 12.301f, 6.931f, 14.161f)
                curveTo(5.661f, 15.001f, 4.961f, 16.151f, 4.961f, 17.381f)
                curveTo(4.961f, 18.611f, 5.661f, 19.751f, 6.921f, 20.591f)
                curveTo(8.321f, 21.531f, 10.161f, 22.001f, 12.001f, 22.001f)
                curveTo(13.841f, 22.001f, 15.681f, 21.531f, 17.081f, 20.591f)
                curveTo(18.341f, 19.741f, 19.041f, 18.601f, 19.041f, 17.361f)
                curveTo(19.031f, 16.141f, 18.341f, 14.991f, 17.081f, 14.161f)
                close()
                moveTo(13.831f, 18.071f)
                horizontalLineTo(10.181f)
                curveTo(9.801f, 18.071f, 9.491f, 17.761f, 9.491f, 17.381f)
                curveTo(9.491f, 17.001f, 9.801f, 16.691f, 10.181f, 16.691f)
                horizontalLineTo(13.831f)
                curveTo(14.211f, 16.691f, 14.521f, 17.001f, 14.521f, 17.381f)
                curveTo(14.521f, 17.761f, 14.211f, 18.071f, 13.831f, 18.071f)
                close()
            }
        }.build()

        return _ProfileRemove!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileRemove: ImageVector? = null
