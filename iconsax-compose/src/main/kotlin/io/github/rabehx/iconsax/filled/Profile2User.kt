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


val Iconsax.Filled.Profile2User: ImageVector
    get() {
        if (_Profile2User != null) {
            return _Profile2User!!
        }
        _Profile2User = ImageVector.Builder(
            name = "Filled.Profile2User",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 2f)
                curveTo(6.38f, 2f, 4.25f, 4.13f, 4.25f, 6.75f)
                curveTo(4.25f, 9.32f, 6.26f, 11.4f, 8.88f, 11.49f)
                curveTo(8.96f, 11.48f, 9.04f, 11.48f, 9.1f, 11.49f)
                curveTo(9.12f, 11.49f, 9.13f, 11.49f, 9.15f, 11.49f)
                curveTo(9.16f, 11.49f, 9.16f, 11.49f, 9.17f, 11.49f)
                curveTo(11.73f, 11.4f, 13.74f, 9.32f, 13.75f, 6.75f)
                curveTo(13.75f, 4.13f, 11.62f, 2f, 9f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.081f, 14.149f)
                curveTo(11.291f, 12.289f, 6.741f, 12.289f, 3.931f, 14.149f)
                curveTo(2.661f, 14.999f, 1.961f, 16.149f, 1.961f, 17.379f)
                curveTo(1.961f, 18.609f, 2.661f, 19.749f, 3.921f, 20.589f)
                curveTo(5.321f, 21.529f, 7.161f, 21.999f, 9.001f, 21.999f)
                curveTo(10.841f, 21.999f, 12.681f, 21.529f, 14.081f, 20.589f)
                curveTo(15.341f, 19.739f, 16.041f, 18.599f, 16.041f, 17.359f)
                curveTo(16.031f, 16.129f, 15.341f, 14.989f, 14.081f, 14.149f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.989f, 7.338f)
                curveTo(20.149f, 9.278f, 18.769f, 10.978f, 16.859f, 11.208f)
                curveTo(16.849f, 11.208f, 16.849f, 11.208f, 16.839f, 11.208f)
                horizontalLineTo(16.809f)
                curveTo(16.749f, 11.208f, 16.689f, 11.208f, 16.639f, 11.228f)
                curveTo(15.669f, 11.278f, 14.779f, 10.968f, 14.109f, 10.398f)
                curveTo(15.139f, 9.478f, 15.729f, 8.098f, 15.609f, 6.598f)
                curveTo(15.539f, 5.788f, 15.259f, 5.048f, 14.839f, 4.418f)
                curveTo(15.219f, 4.228f, 15.659f, 4.108f, 16.109f, 4.068f)
                curveTo(18.069f, 3.898f, 19.819f, 5.358f, 19.989f, 7.338f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.988f, 16.59f)
                curveTo(21.908f, 17.56f, 21.288f, 18.4f, 20.248f, 18.97f)
                curveTo(19.248f, 19.52f, 17.988f, 19.78f, 16.738f, 19.75f)
                curveTo(17.458f, 19.1f, 17.878f, 18.29f, 17.958f, 17.43f)
                curveTo(18.058f, 16.19f, 17.468f, 15f, 16.288f, 14.05f)
                curveTo(15.618f, 13.52f, 14.838f, 13.1f, 13.988f, 12.79f)
                curveTo(16.198f, 12.15f, 18.978f, 12.58f, 20.688f, 13.96f)
                curveTo(21.608f, 14.7f, 22.078f, 15.63f, 21.988f, 16.59f)
                close()
            }
        }.build()

        return _Profile2User!!
    }

@Suppress("ObjectPropertyName")
private var _Profile2User: ImageVector? = null
