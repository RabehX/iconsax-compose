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

val Iconsax.Outline.SearchStatus: ImageVector
    get() {
        if (_SearchStatus != null) {
            return _SearchStatus!!
        }
        _SearchStatus = ImageVector.Builder(
            name = "Outline.SearchStatus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 20.75f)
                curveTo(5.62f, 20.75f, 1.25f, 16.38f, 1.25f, 11f)
                curveTo(1.25f, 5.62f, 5.62f, 1.25f, 11f, 1.25f)
                curveTo(11.41f, 1.25f, 11.75f, 1.59f, 11.75f, 2f)
                curveTo(11.75f, 2.41f, 11.41f, 2.75f, 11f, 2.75f)
                curveTo(6.45f, 2.75f, 2.75f, 6.45f, 2.75f, 11f)
                curveTo(2.75f, 15.55f, 6.45f, 19.25f, 11f, 19.25f)
                curveTo(15.55f, 19.25f, 19.25f, 15.55f, 19.25f, 11f)
                curveTo(19.25f, 10.59f, 19.59f, 10.25f, 20f, 10.25f)
                curveTo(20.41f, 10.25f, 20.75f, 10.59f, 20.75f, 11f)
                curveTo(20.75f, 16.38f, 16.38f, 20.75f, 11f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 5.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 5.75f, 13.25f, 5.41f, 13.25f, 5f)
                curveTo(13.25f, 4.59f, 13.59f, 4.25f, 14f, 4.25f)
                horizontalLineTo(20f)
                curveTo(20.41f, 4.25f, 20.75f, 4.59f, 20.75f, 5f)
                curveTo(20.75f, 5.41f, 20.41f, 5.75f, 20f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 8.75f)
                horizontalLineTo(14f)
                curveTo(13.59f, 8.75f, 13.25f, 8.41f, 13.25f, 8f)
                curveTo(13.25f, 7.59f, 13.59f, 7.25f, 14f, 7.25f)
                horizontalLineTo(17f)
                curveTo(17.41f, 7.25f, 17.75f, 7.59f, 17.75f, 8f)
                curveTo(17.75f, 8.41f, 17.41f, 8.75f, 17f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.16f, 22.79f)
                curveTo(20.08f, 22.79f, 20f, 22.78f, 19.93f, 22.77f)
                curveTo(19.46f, 22.71f, 18.61f, 22.39f, 18.13f, 20.96f)
                curveTo(17.88f, 20.21f, 17.97f, 19.46f, 18.38f, 18.89f)
                curveTo(18.79f, 18.32f, 19.48f, 18f, 20.27f, 18f)
                curveTo(21.29f, 18f, 22.09f, 18.39f, 22.45f, 19.08f)
                curveTo(22.81f, 19.77f, 22.71f, 20.65f, 22.14f, 21.5f)
                curveTo(21.43f, 22.57f, 20.66f, 22.79f, 20.16f, 22.79f)
                close()
                moveTo(19.56f, 20.49f)
                curveTo(19.73f, 21.01f, 19.97f, 21.27f, 20.13f, 21.29f)
                curveTo(20.29f, 21.31f, 20.59f, 21.12f, 20.9f, 20.67f)
                curveTo(21.19f, 20.24f, 21.21f, 19.93f, 21.14f, 19.79f)
                curveTo(21.07f, 19.65f, 20.79f, 19.5f, 20.27f, 19.5f)
                curveTo(19.96f, 19.5f, 19.73f, 19.6f, 19.6f, 19.77f)
                curveTo(19.48f, 19.94f, 19.46f, 20.2f, 19.56f, 20.49f)
                close()
            }
        }.build()

        return _SearchStatus!!
    }

@Suppress("ObjectPropertyName")
private var _SearchStatus: ImageVector? = null
