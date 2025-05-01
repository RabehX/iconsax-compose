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

val Iconsax.Outline.ProfileCircle: ImageVector
    get() {
        if (_ProfileCircle != null) {
            return _ProfileCircle!!
        }
        _ProfileCircle = ImageVector.Builder(
            name = "Outline.ProfileCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.12f, 13.53f)
                curveTo(12.101f, 13.53f, 12.071f, 13.53f, 12.05f, 13.53f)
                curveTo(12.021f, 13.53f, 11.981f, 13.53f, 11.95f, 13.53f)
                curveTo(9.68f, 13.46f, 7.98f, 11.69f, 7.98f, 9.51f)
                curveTo(7.98f, 7.29f, 9.79f, 5.48f, 12.01f, 5.48f)
                curveTo(14.231f, 5.48f, 16.041f, 7.29f, 16.041f, 9.51f)
                curveTo(16.031f, 11.7f, 14.321f, 13.46f, 12.151f, 13.53f)
                curveTo(12.13f, 13.53f, 12.13f, 13.53f, 12.12f, 13.53f)
                close()
                moveTo(12f, 6.97f)
                curveTo(10.601f, 6.97f, 9.47f, 8.11f, 9.47f, 9.5f)
                curveTo(9.47f, 10.87f, 10.54f, 11.98f, 11.901f, 12.03f)
                curveTo(11.931f, 12.02f, 12.031f, 12.02f, 12.13f, 12.03f)
                curveTo(13.47f, 11.96f, 14.521f, 10.86f, 14.531f, 9.5f)
                curveTo(14.531f, 8.11f, 13.401f, 6.97f, 12f, 6.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 22.75f)
                curveTo(9.311f, 22.75f, 6.741f, 21.75f, 4.751f, 19.93f)
                curveTo(4.571f, 19.77f, 4.491f, 19.53f, 4.511f, 19.3f)
                curveTo(4.641f, 18.11f, 5.381f, 17f, 6.611f, 16.18f)
                curveTo(9.591f, 14.2f, 14.421f, 14.2f, 17.391f, 16.18f)
                curveTo(18.621f, 17.01f, 19.361f, 18.11f, 19.491f, 19.3f)
                curveTo(19.521f, 19.54f, 19.431f, 19.77f, 19.251f, 19.93f)
                curveTo(17.261f, 21.75f, 14.691f, 22.75f, 12.001f, 22.75f)
                close()
                moveTo(6.081f, 19.1f)
                curveTo(7.741f, 20.49f, 9.831f, 21.25f, 12.001f, 21.25f)
                curveTo(14.171f, 21.25f, 16.261f, 20.49f, 17.921f, 19.1f)
                curveTo(17.741f, 18.49f, 17.261f, 17.9f, 16.551f, 17.42f)
                curveTo(14.091f, 15.78f, 9.921f, 15.78f, 7.441f, 17.42f)
                curveTo(6.731f, 17.9f, 6.261f, 18.49f, 6.081f, 19.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _ProfileCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ProfileCircle: ImageVector? = null
