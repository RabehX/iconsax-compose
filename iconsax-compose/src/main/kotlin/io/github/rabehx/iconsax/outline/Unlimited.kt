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

val Iconsax.Outline.Unlimited: ImageVector
    get() {
        if (_Unlimited != null) {
            return _Unlimited!!
        }
        _Unlimited = ImageVector.Builder(
            name = "Outline.Unlimited",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.45f, 17.3f)
                curveTo(15.77f, 17.3f, 14.22f, 16.51f, 13.21f, 15.12f)
                curveTo(12.97f, 14.79f, 13.04f, 14.32f, 13.37f, 14.07f)
                curveTo(13.7f, 13.82f, 14.17f, 13.9f, 14.42f, 14.23f)
                curveTo(15.15f, 15.22f, 16.25f, 15.79f, 17.45f, 15.79f)
                curveTo(19.54f, 15.79f, 21.25f, 14.09f, 21.25f, 11.99f)
                curveTo(21.25f, 9.89f, 19.55f, 8.19f, 17.45f, 8.19f)
                curveTo(16.03f, 8.19f, 14.69f, 8.95f, 13.96f, 10.16f)
                lineTo(11.31f, 14.57f)
                curveTo(10.31f, 16.24f, 8.48f, 17.27f, 6.54f, 17.27f)
                curveTo(3.62f, 17.27f, 1.24f, 14.89f, 1.24f, 11.97f)
                curveTo(1.24f, 9.05f, 3.62f, 6.67f, 6.54f, 6.67f)
                curveTo(8.22f, 6.67f, 9.77f, 7.46f, 10.78f, 8.85f)
                curveTo(11.02f, 9.18f, 10.95f, 9.65f, 10.62f, 9.9f)
                curveTo(10.28f, 10.14f, 9.82f, 10.07f, 9.57f, 9.74f)
                curveTo(8.84f, 8.75f, 7.74f, 8.18f, 6.54f, 8.18f)
                curveTo(4.45f, 8.18f, 2.74f, 9.88f, 2.74f, 11.98f)
                curveTo(2.74f, 14.08f, 4.44f, 15.78f, 6.54f, 15.78f)
                curveTo(7.96f, 15.78f, 9.3f, 15.02f, 10.03f, 13.81f)
                lineTo(12.68f, 9.4f)
                curveTo(13.68f, 7.73f, 15.51f, 6.7f, 17.45f, 6.7f)
                curveTo(20.37f, 6.7f, 22.75f, 9.08f, 22.75f, 12f)
                curveTo(22.75f, 14.92f, 20.37f, 17.3f, 17.45f, 17.3f)
                close()
            }
        }.build()

        return _Unlimited!!
    }

@Suppress("ObjectPropertyName")
private var _Unlimited: ImageVector? = null
