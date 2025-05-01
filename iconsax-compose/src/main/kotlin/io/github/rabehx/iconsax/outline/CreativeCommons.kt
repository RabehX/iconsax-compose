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

val Iconsax.Outline.CreativeCommons: ImageVector
    get() {
        if (_CreativeCommons != null) {
            return _CreativeCommons!!
        }
        _CreativeCommons = ImageVector.Builder(
            name = "Outline.CreativeCommons",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.991f, 15.62f)
                curveTo(6.991f, 15.62f, 5.371f, 14f, 5.371f, 12f)
                curveTo(5.371f, 10f, 6.991f, 8.38f, 8.991f, 8.38f)
                curveTo(9.871f, 8.38f, 10.711f, 8.7f, 11.381f, 9.28f)
                curveTo(11.691f, 9.55f, 11.721f, 10.03f, 11.451f, 10.34f)
                curveTo(11.181f, 10.65f, 10.701f, 10.68f, 10.391f, 10.41f)
                curveTo(10.001f, 10.07f, 9.511f, 9.88f, 8.991f, 9.88f)
                curveTo(7.821f, 9.88f, 6.871f, 10.83f, 6.871f, 12f)
                curveTo(6.871f, 13.17f, 7.821f, 14.12f, 8.991f, 14.12f)
                curveTo(9.501f, 14.12f, 10.001f, 13.93f, 10.391f, 13.59f)
                curveTo(10.701f, 13.32f, 11.171f, 13.35f, 11.451f, 13.66f)
                curveTo(11.721f, 13.97f, 11.691f, 14.45f, 11.381f, 14.72f)
                curveTo(10.711f, 15.3f, 9.861f, 15.62f, 8.991f, 15.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.991f, 15.62f)
                curveTo(13.991f, 15.62f, 12.371f, 14f, 12.371f, 12f)
                curveTo(12.371f, 10f, 13.991f, 8.38f, 15.991f, 8.38f)
                curveTo(16.871f, 8.38f, 17.711f, 8.7f, 18.381f, 9.28f)
                curveTo(18.691f, 9.55f, 18.721f, 10.03f, 18.451f, 10.34f)
                curveTo(18.181f, 10.65f, 17.701f, 10.68f, 17.391f, 10.41f)
                curveTo(17.001f, 10.07f, 16.511f, 9.88f, 15.991f, 9.88f)
                curveTo(14.821f, 9.88f, 13.871f, 10.83f, 13.871f, 12f)
                curveTo(13.871f, 13.17f, 14.821f, 14.12f, 15.991f, 14.12f)
                curveTo(16.501f, 14.12f, 17.001f, 13.93f, 17.391f, 13.59f)
                curveTo(17.701f, 13.32f, 18.171f, 13.35f, 18.451f, 13.66f)
                curveTo(18.721f, 13.97f, 18.691f, 14.45f, 18.381f, 14.72f)
                curveTo(17.711f, 15.3f, 16.861f, 15.62f, 15.991f, 15.62f)
                close()
            }
        }.build()

        return _CreativeCommons!!
    }

@Suppress("ObjectPropertyName")
private var _CreativeCommons: ImageVector? = null
