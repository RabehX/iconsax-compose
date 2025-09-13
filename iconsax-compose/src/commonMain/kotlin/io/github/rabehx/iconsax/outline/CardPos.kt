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

val Iconsax.Outline.CardPos: ImageVector
    get() {
        if (_CardPos != null) {
            return _CardPos!!
        }
        _CardPos = ImageVector.Builder(
            name = "Outline.CardPos",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.929f, 16.63f)
                curveTo(3.739f, 16.63f, 3.549f, 16.56f, 3.399f, 16.41f)
                curveTo(3.109f, 16.12f, 3.109f, 15.64f, 3.399f, 15.35f)
                lineTo(15.349f, 3.4f)
                curveTo(15.639f, 3.11f, 16.119f, 3.11f, 16.409f, 3.4f)
                curveTo(16.699f, 3.69f, 16.699f, 4.17f, 16.409f, 4.46f)
                lineTo(4.459f, 16.42f)
                curveTo(4.319f, 16.56f, 4.119f, 16.63f, 3.929f, 16.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.099f, 19.03f)
                curveTo(10.909f, 19.03f, 10.719f, 18.96f, 10.569f, 18.81f)
                curveTo(10.279f, 18.52f, 10.279f, 18.04f, 10.569f, 17.75f)
                lineTo(11.769f, 16.55f)
                curveTo(12.059f, 16.26f, 12.539f, 16.26f, 12.829f, 16.55f)
                curveTo(13.119f, 16.84f, 13.119f, 17.32f, 12.829f, 17.61f)
                lineTo(11.629f, 18.81f)
                curveTo(11.489f, 18.95f, 11.299f, 19.03f, 11.099f, 19.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.79f, 16.34f)
                curveTo(13.601f, 16.34f, 13.41f, 16.27f, 13.26f, 16.12f)
                curveTo(12.97f, 15.83f, 12.97f, 15.35f, 13.26f, 15.06f)
                lineTo(15.651f, 12.67f)
                curveTo(15.941f, 12.38f, 16.42f, 12.38f, 16.711f, 12.67f)
                curveTo(17f, 12.96f, 17f, 13.44f, 16.711f, 13.73f)
                lineTo(14.321f, 16.12f)
                curveTo(14.181f, 16.26f, 13.981f, 16.34f, 13.79f, 16.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.101f, 22.75f)
                curveTo(10.121f, 22.75f, 9.141f, 22.15f, 7.951f, 20.96f)
                lineTo(3.041f, 16.05f)
                curveTo(0.651f, 13.66f, 0.661f, 12.12f, 3.071f, 9.71f)
                lineTo(9.711f, 3.07f)
                curveTo(12.121f, 0.66f, 13.661f, 0.65f, 16.051f, 3.04f)
                lineTo(20.961f, 7.95f)
                curveTo(23.351f, 10.34f, 23.341f, 11.88f, 20.931f, 14.29f)
                lineTo(14.291f, 20.93f)
                curveTo(13.081f, 22.14f, 12.091f, 22.75f, 11.101f, 22.75f)
                close()
                moveTo(12.901f, 2.75f)
                curveTo(12.381f, 2.75f, 11.721f, 3.18f, 10.771f, 4.13f)
                lineTo(4.131f, 10.77f)
                curveTo(3.181f, 11.72f, 2.751f, 12.38f, 2.751f, 12.89f)
                curveTo(2.751f, 13.41f, 3.151f, 14.04f, 4.101f, 14.99f)
                lineTo(9.011f, 19.9f)
                curveTo(9.961f, 20.85f, 10.581f, 21.25f, 11.101f, 21.25f)
                curveTo(11.101f, 21.25f, 11.101f, 21.25f, 11.111f, 21.25f)
                curveTo(11.631f, 21.25f, 12.281f, 20.82f, 13.231f, 19.87f)
                lineTo(19.871f, 13.23f)
                curveTo(20.821f, 12.28f, 21.251f, 11.62f, 21.251f, 11.11f)
                curveTo(21.251f, 10.59f, 20.851f, 9.96f, 19.901f, 9.01f)
                lineTo(14.991f, 4.1f)
                curveTo(14.051f, 3.15f, 13.421f, 2.75f, 12.901f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 22.75f, 1.25f, 22.41f, 1.25f, 22f)
                curveTo(1.25f, 21.59f, 1.59f, 21.25f, 2f, 21.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 21.25f, 22.75f, 21.59f, 22.75f, 22f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22f, 22.75f)
                close()
            }
        }.build()

        return _CardPos!!
    }

@Suppress("ObjectPropertyName")
private var _CardPos: ImageVector? = null
